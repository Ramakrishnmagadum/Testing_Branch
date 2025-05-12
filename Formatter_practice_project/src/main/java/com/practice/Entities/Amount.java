package com.practice.Entities;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;

public class Amount {
	
	private BigDecimal amount;
	private String currencyidentifier;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrencyidentifier() {
		return currencyidentifier;
	}

	public void setCurrencyidentifier(String currencyidentifier) {
		this.currencyidentifier = currencyidentifier;
	}

	@Override
	public String toString() {
		return amount + " " + currencyidentifier;
	}

}
