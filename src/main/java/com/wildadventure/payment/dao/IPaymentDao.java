package com.wildadventure.payment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildadventure.payment.models.Payment;

@Repository
public interface IPaymentDao extends JpaRepository<Payment, Long> {

	public Payment findByBookingId(Long bookingId);
	
	
}
