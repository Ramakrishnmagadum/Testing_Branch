package com.lovecalculator.CustomAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class countryvalidator implements ConstraintValidator<Country, String>{

	String startswith;
	public void initialize(Country country) {
		this.startswith=country.startwith();
	}
	
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value!=null && value.startsWith(startswith)) {
			return true;
		}
		return false;
	}

}
