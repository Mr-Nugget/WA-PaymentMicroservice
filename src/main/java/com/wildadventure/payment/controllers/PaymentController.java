package com.wildadventure.payment.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildadventure.payment.exceptions.BadRequestException;
import com.wildadventure.payment.models.Payment;
import com.wildadventure.payment.models.PaymentRequestMapping;
import com.wildadventure.payment.models.PaymentResponseMapping;
import com.wildadventure.payment.models.RequestUpdateBooking;
import com.wildadventure.payment.models.Transaction;
import com.wildadventure.payment.proxies.IBookingProxy;
import com.wildadventure.payment.services.IPaymentService;
import com.wildadventure.payment.services.ITransactionService;
import com.wildadventure.payment.utils.IPaymentUtils;

@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping("/Payment")
public class PaymentController {
	
	@Autowired
	private IPaymentService paymentService;
	
	@Autowired
	private ITransactionService transactionService;
	
	@Autowired
	private IBookingProxy bookingProxy;
	
	@Autowired
	private IPaymentUtils utils;
	
	private static Logger log = Logger.getLogger(PaymentController.class);

	/**
	 * Check if the payment already exists, if not create it and add the first transaction associated
	 * if the payment exists add a transaction associated to it
	 * @param request
	 * @return a paymentResponseMapping with booking infos
	 * @throws BadRequestException 
	 */
	@PostMapping("/add")
	public ResponseEntity<PaymentResponseMapping> addPayment(@RequestBody PaymentRequestMapping request) throws BadRequestException{
		log.info(request);
		if(request != null) {
			// Check if the payment exists
			Payment paymentExists = paymentService.getPaymentByBooking(request.getBookingId());
			// If not create it
			if(paymentExists == null) {
				Transaction transactionAdded = utils.extractTransactionFromRequest(request);				
				Payment paymentAdded = utils.extractPaymentFromRequest(request);
				Payment paymentCreated = paymentService.addPayment(paymentAdded);
				transactionAdded.setPayment(paymentCreated);
				
				Transaction transactionCreated = transactionService.addTransaction(transactionAdded);
				
				if(paymentCreated != null && transactionCreated != null) {
					if(paymentCreated.getAuthorized()){
						bookingProxy.updatePayment(new RequestUpdateBooking(true, paymentCreated.getBookingId()));
					}
					return ResponseEntity.ok(new PaymentResponseMapping());
				}else {
					return ResponseEntity.status(400).build();
				}
			}
			// Else, add a transaction asssociated
			else {
				Transaction transactionAdded = utils.extractTransactionFromRequest(request);
				transactionAdded.setPayment(paymentExists);
				
				Transaction transactionCreated = transactionService.addTransaction(transactionAdded);
				
				if(transactionCreated != null) {
					return ResponseEntity.ok(new PaymentResponseMapping());
				}else {
					return ResponseEntity.status(400).build();
				}
			}
		}else {
			throw new BadRequestException("Error of request params");
		}
	}
}
