package com.Sriram.Spring.SpringSecurityLearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
     
	@GetMapping("/account")
	public String getAccount() {
		return "The Account details from the DB";
	}	
}
