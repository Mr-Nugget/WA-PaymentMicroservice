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
	@Column(name="UPDATE_DATE")
	private Date updateDate;
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
	
	

	public Transaction(Long id, Date updateDate, String transactionNumber, String message, String status,
			String fundingSource, String payerName, String payerFirstname, String payerMail, String payerCountryCode,
			Payment payment) {
		super();
		this.id = id;
		this.updateDate = updateDate;
		this.transactionNumber = transactionNumber;
		this.message = message;
		this.status = status;
		this.fundingSource = fundingSource;
		this.payerName = payerName;
		this.payerFirstname = payerFirstname;
		this.payerMail = payerMail;
		this.payerCountryCode = payerCountryCode;
		this.payment = payment;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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



	@Override
	public String toString() {
		return "Transaction [id=" + id + ", updateDate=" + updateDate + ", transactionNumber=" + transactionNumber
				+ ", message=" + message + ", status=" + status + ", fundingSource=" + fundingSource + ", payerName="
				+ payerName + ", payerFirstname=" + payerFirstname + ", payerMail=" + payerMail + ", payerCountryCode="
				+ payerCountryCode + ", payment=" + payment + "]";
	}
	
	
}
