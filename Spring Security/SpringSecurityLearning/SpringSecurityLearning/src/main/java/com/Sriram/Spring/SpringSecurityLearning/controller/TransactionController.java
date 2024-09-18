package com.Sriram.Spring.SpringSecurityLearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
	@GetMapping("/transaction")
	public String getTransactionDetail() {
		return "The Transaction details from the DB";
	}
}
