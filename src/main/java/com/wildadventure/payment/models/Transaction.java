package com.wildadventure.payment.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {

	@Id
	@GeneratedValue
	@Column(name="TRANSACTION_ID")
	private Long id;
	@Column(name="DATE")
	private Date date;
	@Column(name="TRANSACTION_NUMBER")
	private String transactionNumber;
	@Column(name="MESSAGE")
	private String message;
	@Column(name="STATUS")
	private String status;
	@Column(name="FUNDING_SOURCE")
	private String fundingSource;
	@Column(name="PAYER_NAME")
	private String payerName;
	@Column(name="PAYER_FIRSTNAME")
	private String payerFirstname;
	@Column(name="PAYER_MAIL")
	private String payerMail;
	@Column(name="PAYER_COUNTRY_CODE")
	private String payerCountryCode;
	
	@ManyToOne
	@JoinColumn(name="PAYMENT_ID")
	private Payment payment;
	
	public Transaction(){
		
	}
	
	public Transaction(Long id, Date date, String transactionNumber, String message, String status,
			String fundingSource, String payerName, String payerFirstname, String payerMail, String payerCountryCode) {
		super();
		this.id = id;
		this.date = date;
		this.transactionNumber = transactionNumber;
		this.message = message;
		this.status = status;
		this.fundingSource = fundingSource;
		this.payerName = payerName;
		this.payerFirstname = payerFirstname;
		this.payerMail = payerMail;
		this.payerCountryCode = payerCountryCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFundingSource() {
		return fundingSource;
	}

	public void setFundingSource(String fundingSource) {
		this.fundingSource = fundingSource;
	}

	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerFirstname() {
		return payerFirstname;
	}

	public void setPayerFirstname(String payerFirstname) {
		this.payerFirstname = payerFirstname;
	}

	public String getPayerMail() {
		return payerMail;
	}

	public void setPayerMail(String payerMail) {
		this.payerMail = payerMail;
	}

	public String getPayerCountryCode() {
		return payerCountryCode;
	}

	public void setPayerCountryCode(String payerCountryCode) {
		this.payerCountryCode = payerCountryCode;
	}
}
