package com.wildadventure.payment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildadventure.payment.models.Payment;
import com.wildadventure.payment.models.Transaction;


@Repository
public interface ITransactionDao extends JpaRepository<Transaction, Long>{

	public List<Transaction> findByPayment(Payment payment);
	
}
