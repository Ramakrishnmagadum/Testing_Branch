package com.lovecalculator.CustomAnnotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//it will create javadoc of this class
@Documented

//it will decide upto what stages it should be avalible 
// Example :RUNTIME --it will availble compiling and at the runtime... 
//          SOURCE --> it will avaible only at compile time...
@Retention(RUNTIME)

//it will tell where to add the annotation Example : On method , on Varible/Filed , on Constructer so on
@Target(FIELD)

//Every Annotations has certain conditions need to check(Example @notNull --it will check is it null or not )
//--if all conditions are passed then it will proceed else it will thow the error
//so that bussinees logics where done in some other class which implements "ConstraintValidator"
//and by this annotation we provide that class address
@Constraint(validatedBy = Agevalidatorconstraint.class)
public @interface Age {

	// this are the varibles we can pass as parameter to annotation
	// By this parameter we can validate and display the message also
//	if Override from default values else it will take as default values
	int lower() default 18;

	int higger() default 60;

//	instead of hardcoding the message here will write inside .properties file and make it global.Age..
//	String message() default "Age should be between {lower} to {higger}";
	
//	InvalidAge --> this key present in .properties File and By this it will written the Message.....
	String message() default "{InvalidAge}";
	
	//write this two line of code --> as its present in all the annotation class...
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };
	
	
}
