package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

//Scope--
//RequestScope :- We are sending the request and getting the response this is one request scope ---
//in this all the request query Strings/Objects will be destroyed once the particuler request scope is over.
//here one request i fired and Model object having some data and it displayed on view ---request cycle is completed 
//so Model object is destroyed --so in next page if we want data present in last Model it is not possible bcz once request Cycle completes -->Model will get distroyed ---> so to avaoid this we follow the Session Scope..
//
//Session Scope with same cotroller 
//it will come to request scope again and its prooved also...
//
//---Conversational Scope ---  Need To do..
//The @SessionAttributes annotation in Spring MVC facilitates a conversational scope, which is longer than a request scope but shorter than a full session scope. It allows specific model attributes to be stored in the HTTP session, maintaining their values across multiple requests within a user's interaction flow with a particular controller.
//Specifically, @SessionAttributes is used at the controller level to declare model attributes that should be managed in the session. When a controller adds an attribute to the model with a name matching one declared in @SessionAttributes, Spring automatically saves it in the session. This attribute remains available for subsequent requests handled by the same controller, effectively creating a conversational scope tied to the controller's lifecycle.
//To end the conversational scope and remove the attributes from the session, SessionStatus.setComplete() should be called. If this is not done, the attributes will remain in the session, potentially leading to undesired side effects.
//
//--session status--
//status.setcomplete() ---it will end the session cycle --it will remove the value inside the session scope...


@Controller
@SessionAttributes("firstname")  //this will add "firstname" value inside the session so it available to whole session ...
public class FirstController {
	@RequestMapping("/first")
	public String handlingmethod1(Model model) {
		model.addAttribute("firstname","Ramakrishna" );
		model.addAttribute("secondname","Magadum" );
		model.addAttribute("next","/second" );
		return "index";
		}
	
	
//	this second Request Scope --> here their Value passing But @SessionAttributes("firstname") is present in this same controller 
//	so whatever Data/value present inside session --> that value will come and sit in model for this request Scope ....
	@RequestMapping("/second")
	public String handlingmethod2(Model model , SessionStatus status) {
//		here no need to addattribute as "firstname" and "lastname" bcz both are available in session and 
//		and if they are available in session then --> and its same controller class it will add to inside Model Object also... 
		model.addAttribute("next","/third" );
		status.setComplete();  ///it will remove the session object from session scope ..
		return "index";
		}
	
	
	@RequestMapping("/third")
	public String handlingmethod3(Model model) {
		return "index";
		}
}
