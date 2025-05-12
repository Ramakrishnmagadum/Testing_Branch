package com.lovecalculator.CustomAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Agevalidatorconstraint implements ConstraintValidator<Age, Integer> {

	int lower;
	int higger;

	// this method will call while initializing
	public void initialize(Age age) {
		System.out.println("Agevalidatorconstraint init method called");
//		age --> this age having the lower and higger value form the @Age(lower=2, higger=10) this place
//		Else ---> it will take default values 
		this.lower = age.lower();
		this.higger = age.higger();
	}

	// in this will write the bussiness checks..
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		System.out.println("Agevalidatorconstraint isvalid method called");
		if (value == null || (value < lower || value > higger)) {
			return false;
		}
		return true;
	}
}