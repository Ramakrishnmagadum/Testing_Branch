package com.practice.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.practice.Entities.CardNumber;
import com.practice.Entities.Card_details;

public class Cardnumberformatter implements Formatter<CardNumber> {

	public String print(CardNumber object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	public CardNumber parse(String text, Locale locale) throws ParseException {
		if (text != null) {
			String[] input = text.split("-");
			CardNumber cardnumber = new CardNumber();
			if (input.length == 4) {
				cardnumber.setFirstfourdigit(input[0]);
				cardnumber.setSecondfourdigit(input[1]);
				cardnumber.setThirdfourdigit(input[2]);
				cardnumber.setFourthfourdigit(input[3]);
				return cardnumber;
			}

		}
		return null;
	}

}
