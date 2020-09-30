package com.wildadventure.payment.utils;

import com.wildadventure.payment.models.Payment;
import com.wildadventure.payment.models.PaymentRequestMapping;
import com.wildadventure.payment.models.Transaction;

public interface IPaymentUtils {
	
	public Payment extractPaymentFromRequest(PaymentRequestMapping request);
	
	public Transaction extractTransactionFromRequest(PaymentRequestMapping request);

}
