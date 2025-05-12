package HttpSession;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionHomecontroller {

	@RequestMapping("/sessionhomepage")
	public String gethomepage(@ModelAttribute("student") StudentBean student) {
		return "Session-Home-page";
	}

	@RequestMapping("/sessionresultpage")
	public String getresultPage(@ModelAttribute("student") StudentBean student ,HttpServletRequest request) {
		
//		creating session  and this will be avaliable in all the jsp pages and java pagaes thought this session ..
		HttpSession session =request.getSession();  //this object will return the session --> if session presrent then it will return existing else it will create new session..
//		adding values to session....
		session.setAttribute("username", student.getUsername());
//		this to expiry the Session after this much of Time...
//		session.setMaxInactiveInterval(120);
		
		
		return "AnnotationSession-resultpage";
	}

	
	@RequestMapping("/ShowSession")
	public String showcookiePage(Model model, HttpServletRequest request ,HttpSession session) {
//		here i am getting Value form session level and adding into the Model --> So in View we can display it ..
//		directly By SessionVarible also we acces directly inside JSP file and we can like this also ....
//		in process-email --> directly from session getting values ...
		String username = session.getAttribute("username").toString();
		model.addAttribute("controllerusername", username);
		
		return "ShowSession";
	}


}
