package com.practice.formatter;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.practice.Entities.Amount;

public class amountformatter implements Formatter<Amount> {

	public String print(Amount object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	public Amount parse(String text, Locale locale) throws ParseException {
		String[] amount = text.split(" ");
		Amount bean = new Amount();
		bean.setAmount(new BigDecimal(amount[0]));
		Currency currecny = Currency.getInstance(amount[1]);
		bean.setCurrencyidentifier(currecny.getSymbol());
		return bean;
	}

}
