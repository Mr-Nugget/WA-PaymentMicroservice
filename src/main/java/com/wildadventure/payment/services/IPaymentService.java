package com.wildadventure.payment.services;

import com.wildadventure.payment.models.Payment;

public interface IPaymentService {
	
	public Payment getPaymentByBooking(Long bookingId);
	
	public Payment addPayment(Payment payment);
	
	public Payment updatePayment(Payment payment);
}
