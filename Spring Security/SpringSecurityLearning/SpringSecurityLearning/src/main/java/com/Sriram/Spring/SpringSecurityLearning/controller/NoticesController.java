package com.Sriram.Spring.SpringSecurityLearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
   
	@GetMapping("/notices")
	public String getNotices() {
		return "The notices details from the DB";
	}
}
