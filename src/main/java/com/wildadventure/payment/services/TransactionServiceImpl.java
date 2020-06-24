package com.wildadventure.payment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildadventure.payment.dao.ITransactionDao;
import com.wildadventure.payment.models.Payment;
import com.wildadventure.payment.models.Transaction;

@Service
public class TransactionServiceImpl implements ITransactionService{
	
	@Autowired
	private ITransactionDao transactionDao;

	@Override
	public Transaction addTransaction(Transaction transaction) {
		return transactionDao.save(transaction);
	}

	@Override
	public List<Transaction> getListOfTransaction(Payment payment) {
		return transactionDao.findByPayment(payment);
	}

}
