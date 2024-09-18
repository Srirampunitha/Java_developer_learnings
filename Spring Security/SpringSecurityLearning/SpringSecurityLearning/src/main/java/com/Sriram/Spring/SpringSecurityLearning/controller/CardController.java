package com.Sriram.Spring.SpringSecurityLearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
     
	@GetMapping("/mycards")
	public String getMyCards() {
		return "The Card details from the DB";
	}
}
