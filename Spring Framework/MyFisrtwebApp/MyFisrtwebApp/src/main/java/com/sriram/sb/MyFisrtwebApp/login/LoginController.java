package com.sriram.sb.MyFisrtwebApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sriram.sb.MyFisrtwebApp.login.authentication.AuthenticationService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	private AuthenticationService authenticate ;
	@GetMapping("login")
	public String loginpage() {
		return "login";
	}
	
	@PostMapping("login")
	public String gotoinsideloginpage(@RequestParam String name ,String password , ModelMap model) {
		if(authenticate.isValidUser(name, password)) {
		model.put("name", name);
		model.put("password", password);
		return "welcome";
		}
		model.put("errormessage", "Invalid credentials ! please valid credentials");
		return "login";
	}
}
