package com.wildadventure.payment.models;

import java.util.Date;

/**
 * Object to handle request data from client when a payment is send
 * @author Titouan
 *
 */
public class PaymentRequestMapping {
	
	private Date createDate;
	private Date updateDate;
	private String transactionNumber;
	private String currency;
	private Float price;
	private Boolean authorized;
	private Long bookingId;
	private String message;
	private String status;
	private String fundingSource;
	private String payerName;
	private String payerFirstname;
	private String payerMail;
	private String payerCountryCode;
	
	public PaymentRequestMapping() {
		
	}
	
	public PaymentRequestMapping(Date createDate, Date updateDate, String transactionNumber, String currency,
			Float price, Boolean authorized, Long bookingId, String message, String status, String fundingSource,
			String payerName, String payerFirstname, String payerMail, String payerCountryCode) {
		super();
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.transactionNumber = transactionNumber;
		this.currency = currency;
		this.price = price;
		this.authorized = authorized;
		this.bookingId = bookingId;
		this.message = message;
		this.status = status;
		this.fundingSource = fundingSource;
		this.payerName = payerName;
		this.payerFirstname = payerFirstname;
		this.payerMail = payerMail;
		this.payerCountryCode = payerCountryCode;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Boolean getAuthorized() {
		return authorized;
	}

	public void setAuthorized(Boolean authorized) {
		this.authorized = authorized;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
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
		return "PaymentRequestMapping [createDate=" + createDate + ", updateDate=" + updateDate + ", transactionNumber="
				+ transactionNumber + ", currency=" + currency + ", price=" + price + ", authorized=" + authorized
				+ ", bookingId=" + bookingId + ", message=" + message + ", status=" + status + ", fundingSource="
				+ fundingSource + ", payerName=" + payerName + ", payerFirstname=" + payerFirstname + ", payerMail="
				+ payerMail + ", payerCountryCode=" + payerCountryCode + "]";
	}
	
	

}
