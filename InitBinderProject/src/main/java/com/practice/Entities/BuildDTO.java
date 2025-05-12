package com.practice.Entities;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public class BuildDTO {
	private String name;
	private String surname;
	private BigDecimal amount;
	private Currency currency;
	private Date date;
	private CreditCard creditcard;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public CreditCard getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(CreditCard creditcard) {
		this.creditcard = creditcard;
	}
	@Override
	public String toString() {
		return "BuildDTO [amount=" + amount + ", currency=" + currency + ", date=" + date + ", creditcard=" + creditcard
				+ "]";
	}
}
