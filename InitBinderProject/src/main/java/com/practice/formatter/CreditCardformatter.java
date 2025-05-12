package com.practice.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import com.practice.Entities.CreditCard;

public class CreditCardformatter implements Formatter<CreditCard> {

	public String print(CreditCard object, Locale locale) {

		// TODO Auto-generated method stub
		return null;
	}

	public CreditCard parse(String text, Locale locale) throws ParseException {
		String[] digitarray =text.split("-");
		CreditCard card=new CreditCard();
		card.setFirstfourdigit(Integer.valueOf(digitarray[0]));
		card.setSecondfourdigit(Integer.valueOf(digitarray[1]));
		card.setThirdfourdigit(Integer.valueOf(digitarray[2]));
		card.setFourthfourdigit(Integer.valueOf(digitarray[3]));
		return card;
	}

}
