package com.wildadventure.payment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildadventure.payment.dao.IPaymentDao;
import com.wildadventure.payment.models.Payment;

@Service
public class PaymentServiceImpl implements IPaymentService {
	
	@Autowired
	private IPaymentDao paymentDao;

	@Override
	public Payment getPaymentByBooking(Long bookingId) {
		return paymentDao.findByBookingId(bookingId);
	}

	@Override
	public Payment addPayment(Payment payment) {
		return paymentDao.save(payment);
	}

	@Override
	public Payment updatePayment(Payment payment) {
		return paymentDao.save(payment);
	}

}
