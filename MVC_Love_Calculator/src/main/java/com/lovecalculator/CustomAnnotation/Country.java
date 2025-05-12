package com.lovecalculator.CustomAnnotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy=countryvalidator.class)
public @interface Country {

	String startwith() default "A";

	String message() default "{invalidcountry}";

	// write this two line of code --> as its present in all the annotation class...
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
