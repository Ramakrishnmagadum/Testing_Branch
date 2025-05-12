package com.lovecalculator.Formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.lovecalculator.Entities.Phone;

//this is only related to the Phone Bean --for this we will format
//Formatter is Interface --it has two methods 
//1 . parse :- this method used to convert the String to Object Type 
//2. print :- this is used to format when showing the values in the screen (it will conver the Object Type to String Type to display on Screen)
//to register this Formatter need to register in Handler Mapping File ...
public class PhoneFormatter implements Formatter<Phone>{

//	when we are editing then form database we are getting values and need to show in view page ..
//	...But we are passing the Object as phone object but it will deal with only String 
//	this object need to convert to string so   we can able to show in view page........
	
//	when this method will Execute 
//	 if its not able to bind it .. then this method will get Execute then inside the print method need to write logic for this ............
	public String print(Phone object, Locale locale) {
		return object.getCountrycode()+"-"+object.getPhonenumber();
	}

//	this method has two varibles 
//	1. text : - in this varible user typed values will store and with that data --we will format and send to return 
//	2. locale : --this use for transalation --like langugae Translation or currency so on based on geograpical
	public Phone parse(String text, Locale locale) throws ParseException {
		String[] data = text.split("-");
		System.out.println("phone formatter excuting..");
		Phone phone=new Phone();
		if(data.length==1) {
			phone.setCountrycode("91");
			phone.setPhonenumber(data[0]);
		}else {
		phone.setCountrycode(data[0].length()==0 ? "91" : data[0]   );
		phone.setPhonenumber(data[1]);
		}
		return phone;
	}

}
