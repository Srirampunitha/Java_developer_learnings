package com.Sriram.Spring.SpringSecurityLearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
     
	@GetMapping("/balance")
	public String getBalance() {
		return "The Balance details from the DB";
	}
}
