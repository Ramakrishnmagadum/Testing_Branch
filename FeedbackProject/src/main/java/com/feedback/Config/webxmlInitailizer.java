package com.feedback.Config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class webxmlInitailizer  implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webapplicationcontext =new AnnotationConfigWebApplicationContext();
		webapplicationcontext.register(ControllerMapping.class);
		
		DispatcherServlet dispatcherServlet=new  DispatcherServlet(webapplicationcontext);
		
		Dynamic servlet = servletContext.addServlet("MyFeedbackServlet", dispatcherServlet);
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
		
	}

}
