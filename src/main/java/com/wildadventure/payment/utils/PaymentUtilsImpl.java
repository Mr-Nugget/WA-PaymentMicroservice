package com.wildadventure.payment.utils;

import org.springframework.stereotype.Component;

import com.wildadventure.payment.models.Payment;
import com.wildadventure.payment.models.PaymentRequestMapping;
import com.wildadventure.payment.models.Transaction;

/**
 * Utils methode for payment like extraction from request
 * @author Titouan
 *
 */
@Component
public class PaymentUtilsImpl implements IPaymentUtils {
	
	public PaymentUtilsImpl() {
	}

	@Override
	public Payment extractPaymentFromRequest(PaymentRequestMapping request) {
		Payment paymentAdded = new Payment();
		paymentAdded.setAuthorized(request.getAuthorized());
		paymentAdded.setBookingId(request.getBookingId());
		paymentAdded.setPrice(request.getPrice());
		paymentAdded.setCurrency(request.getCurrency());
		paymentAdded.setCreateDate(request.getCreateDate());

		return paymentAdded;
	}

	@Override
	public Transaction extractTransactionFromRequest(PaymentRequestMapping request) {
		Transaction transactionAdded = new Transaction();
		transactionAdded.setUpdateDate(request.getUpdateDate());
		transactionAdded.setFundingSource(request.getFundingSource());
		transactionAdded.setMessage(request.getMessage());
		transactionAdded.setStatus(request.getStatus());
		transactionAdded.setTransactionNumber(request.getTransactionNumber());
		transactionAdded.setPayerMail(request.getPayerMail());
		transactionAdded.setPayerFirstname(request.getPayerFirstname());
		transactionAdded.setPayerName(request.getPayerName());
		transactionAdded.setPayerCountryCode(request.getPayerCountryCode());
		
		return transactionAdded;
	}

}
