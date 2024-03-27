package com.sriram.sb.MyFisrtwebApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	
	@GetMapping("/")
	public String loginpage(ModelMap model) {
		model.put("name",getLoggeduserDetails());
		return "welcome";
	}

	private String  getLoggeduserDetails() {
		Authentication auth =  SecurityContextHolder.getContext().getAuthentication() ;
	   return auth.getName() ;
	}
	
}
