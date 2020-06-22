package com.wildadventure.payment.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Payment {

	@Id
	@GeneratedValue
	@Column(name="PAYMENT_ID")
	private Long id;
	@Column(name="BOOKING_ID")
	private Long bookingId;
	@Column(name="PRICE")
	private Float price;
	@Column(name="CURRENCY")
	private String currency;
	@Column(name="AUTHORIZED")
	private Boolean authorized;
	
	@OneToMany(mappedBy="payment")
	private List<Transaction> transactionList;
	
	public Payment() {
		
	}

	public Payment(Long id, Long bookingId, Float price, String currency, Boolean authorized,
			List<Transaction> transactionList) {
		super();
		this.id = id;
		this.bookingId = bookingId;
		this.price = price;
		this.currency = currency;
		this.authorized = authorized;
		this.transactionList = transactionList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Boolean getAuthorized() {
		return authorized;
	}

	public void setAuthorized(Boolean authorized) {
		this.authorized = authorized;
	}

	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", bookingId=" + bookingId + ", price=" + price + ", currency=" + currency
				+ ", authorized=" + authorized + ", transactionList=" + transactionList + "]";
	}	
	
}
