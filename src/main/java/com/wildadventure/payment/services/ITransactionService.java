package com.wildadventure.payment.services;

import java.util.List;

import com.wildadventure.payment.models.Payment;
import com.wildadventure.payment.models.Transaction;

public interface ITransactionService {
	
	public Transaction addTransaction(Transaction transaction);
	
	public List<Transaction> getListOfTransaction(Payment payment);
}
