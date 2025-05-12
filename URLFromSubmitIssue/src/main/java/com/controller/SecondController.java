package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SecondController {
	//once this  ProcessHelloWorld -->url fired then---> this method will get call and 
//	for this url should look like --> http://localhost:8080/URLFromSubmitIssue/ProcessHelloWorld
//	but if i am coming from the MyController Then Url is already concatinated with "mvc/app/" so url becomes like "http://localhost:8080/URLFromSubmitIssue/mvc/app/ProcessHelloWorld
//	but this not valide then to solve this Problem will use 
//	rootcontext(Project Name) concatinate with ProcessHelloWorld URL
//	Example :- ${pageContext.request.contextPath}/ProcessHelloWorld
	@RequestMapping("/ProcessHelloWorld")
	public String ProcessHelloWorldPage() {
		return "ProcessHelloWorld";
	}
}
