package com.practice.Converter;

import org.springframework.core.convert.converter.Converter;

import com.practice.Entities.CreditCard;


//Converter<String, CreditCard>   --> here inside this we will pass two parameters
//two parameter will say like --> Converting String --to -- CreditCard

//And if i want to From Object to String Conversion need to Create one more ConverterClass...
//This Converter Need to Register inside the Config File
public class CreditCardConverter implements Converter<String, CreditCard> {

	public CreditCard convert(String source) {
		String[] digitarray =source.split("-");
		CreditCard card=new CreditCard();
		card.setFirstfourdigit(Integer.valueOf(digitarray[0]));
		card.setSecondfourdigit(Integer.valueOf(digitarray[1]));
		card.setThirdfourdigit(Integer.valueOf(digitarray[2]));
		card.setFourthfourdigit(Integer.valueOf(digitarray[3]));
		return card;
	}

}
