package sessionAttributesexample2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class SecondController {
	
//	here we are trying to fetch "username" from requestScope and as well as Session Scope 
//	here username --> will present in Session Scope but not in Request Scope --> BCZ this is not same Controller where @sessionAttributes annotated 
	@RequestMapping("/second2")
	public String getmethod1(Model model , HttpSession session ){
		System.out.println("name is "+ session.getAttribute("username"));
		return "secondExample";
		
	}

}
