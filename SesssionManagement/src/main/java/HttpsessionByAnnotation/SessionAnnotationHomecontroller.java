package HttpsessionByAnnotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("studentinfo")
//Only StudentBean --related data will get store inside the server...
//here studentinfo--is key for this key model.addAttribute("studentinfo", new StudentBean()); --added attribute and fot this object whatver data added are strored inside the serevr

public class SessionAnnotationHomecontroller {

	@RequestMapping("/sessionAnnotationhomepage")
	public String gethomepage(Model model) {
//		this will create object and into model and in result page for this model will add dynamic data from user and that dat will be stored inside the Server
//		and HttpSession and OTHER thing will take care internally 
		model.addAttribute("studentinfo", new StudentBean());
		return "AnnotationSession-Home-page";
	}

	@RequestMapping("/sessionAnnotationresultpage")
	public String getresultPage(@ModelAttribute("studentinfo") StudentBean student) {
		return "AnnotationSession-resultpage";
	}

	
	@RequestMapping("/HttpSessionAnnotation")
//Imp --	here not passing anything but still it get data from the session ...By Key "studentinfo" 
	public String showcookiePage() {
		return "HttpSessionAnnotation";
	}

}
