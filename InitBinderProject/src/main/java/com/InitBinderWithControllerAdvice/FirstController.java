package com.InitBinderWithControllerAdvice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.Entities.BuildDTO;
import com.practice.Entities.CreditCard;

@Controller
@ControllerAdvice
public class FirstController {

	

	@RequestMapping("/initfirst")
	public String gethomepage(@ModelAttribute("details") BuildDTO details) {
		
//		on LoadOn page adding the Values...
		CreditCard card=new CreditCard();
		card.setFirstfourdigit(1234);
		card.setSecondfourdigit(2345);
		card.setThirdfourdigit(3456);
		card.setFourthfourdigit(4567);
		details.setCreditcard(card);
		return "Home-page";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Inside the Package om.InitBinderWithControllerAdvice InitBinder method");
	}
	
	
}
