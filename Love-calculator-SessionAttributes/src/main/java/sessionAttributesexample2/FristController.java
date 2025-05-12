package sessionAttributesexample2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
//this username -->will be avalaible to session level ....
//in same controller if we pass the one more request then --> it will follow the "Conversational" Scope and during the request
//and during the request  inside same controller --> Session object will come and sit inside the request Scope....
@SessionAttributes("username")
public class FristController {
	
	@RequestMapping("/first2")
	public String getmethod1(Model model) {
		model.addAttribute("username" ,"Ramakrishna");
		model.addAttribute("surname" ,"Magadum");
		model.addAttribute("next", "/first3");
		return "secondExample";
		
	}
	
//	here it will follow the "conversation Scope so Values is avalible in both request and session scope..
	@RequestMapping("/first3")
	public String getmethod2(Model model) {
		String name =model.getAttribute("username").toString();
		
		model.addAttribute("next", "/second2");
		System.out.println("username is fetching from request Cycle "+name );
		return "secondExample";
		
	}

}
