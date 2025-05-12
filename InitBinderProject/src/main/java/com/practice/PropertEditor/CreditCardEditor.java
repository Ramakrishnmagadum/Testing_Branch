package com.practice.PropertEditor;

import java.beans.PropertyEditorSupport;

import com.practice.Entities.CreditCard;

public class CreditCardEditor extends PropertyEditorSupport{
	
	@Override
		public String getAsText() {
		//it will give the values whatever binded to the particuler Bean...
		CreditCard card =(CreditCard) getValue();
		return card.toString();
		}
	
	
 @Override
public void setAsText(String text) throws IllegalArgumentException {
	 String[] digitarray =text.split("-");
		CreditCard card=new CreditCard();
		card.setFirstfourdigit(Integer.valueOf(digitarray[0]));
		card.setSecondfourdigit(Integer.valueOf(digitarray[1]));
		card.setThirdfourdigit(Integer.valueOf(digitarray[2]));
		card.setFourthfourdigit(Integer.valueOf(digitarray[3]));
		
		//it will set the formatted data to the Bean/Object...
     setValue(card);
}
 
}
