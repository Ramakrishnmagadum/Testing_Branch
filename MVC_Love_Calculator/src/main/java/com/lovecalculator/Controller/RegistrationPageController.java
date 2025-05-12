package com.lovecalculator.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lovecalculator.Entities.CommunicationDTO;
import com.lovecalculator.Entities.Phone;
import com.lovecalculator.Entities.SignupBean;

@Controller
public class RegistrationPageController {

	@RequestMapping("/signup")
	public String showregistrationpage(@ModelAttribute("signup") SignupBean signup) {

//		By default i am setting the Phone then also it should follow the Date Format Because we are passing the Phone Object
		Phone phone = new Phone();
		phone.setCountrycode("12");
		phone.setPhonenumber("1234567");

		CommunicationDTO comdto = new CommunicationDTO();
		comdto.setPhone(phone);
		signup.setCommunicationdto(comdto);
		System.out.println("for phone setting the values " + phone.toString());
		return "sign-up";
	}

	@RequestMapping("/signup_details")
//	@Valid --this will trigger the validation of that particuler Bean and validate ,
//	if any erorrs the =n it will store in BindingResult --Through Binding Result we will get the errors...
	public String getDetails(@Valid @ModelAttribute("signup") SignupBean signup, BindingResult result) {
		System.out.println("after trimming the Username in InitMethod |" + signup.getUsername() + "|");
		System.out.println("after submit Method");
		if (result.hasErrors()) {
			return "sign-up";
		}
		return "signup_details";
	}

//	this method will excute For request before going to bind the data ...
//	When data will bind ---> Whenever hit the url then @RequestMapping("/")    if this url matches then @ModelAttribute will help to bind the data
//	so before binding the data ---> this method will get excute and inside this we can do 
//	Property Editer or Validations  and so on.....
	@InitBinder
	public void initBinder(WebDataBinder binder) {
//		WebDataBinder --> this WebDataBinder is responsible to bind the data to the object --by default it will bind 
//		if we want to customize that then we can do it here by using "WebDataBinder" object...
		System.out.println("Inside the inti Binder Method....");

//		For Username if i am entering String like "ram         " which has white space By this we can trimmer the white space  (this is property Editer)
//		Why we have to trimmer for some time --> Example if username size should be more then 3 then if we three spaces --> those spaces also it will consider as letters so it will pass the validation but it should happen so we will do like this to  avoid that..
		StringTrimmerEditor trimmer = new StringTrimmerEditor(false);
		binder.registerCustomEditor(String.class, "username", trimmer);

//		whatever the varible will give here for that varible it will remove the user entered  value and make it as Null
//		binder.setDisallowedFields("gender");

	}

}
