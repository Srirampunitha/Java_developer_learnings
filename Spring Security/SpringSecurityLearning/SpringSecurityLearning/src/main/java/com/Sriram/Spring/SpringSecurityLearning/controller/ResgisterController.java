package com.Sriram.Spring.SpringSecurityLearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sriram.Spring.SpringSecurityLearning.model.Customer;
import com.Sriram.Spring.SpringSecurityLearning.repository.CustomerRepoitory;

@RestController
public class ResgisterController {
  
	@Autowired 
   private CustomerRepoitory repo ;
	
	@Autowired
	private PasswordEncoder passwordencoder;
	
	@PostMapping("/register")
	public ResponseEntity<Object> addUsers(@RequestBody Customer customer){
		System.out.println("Entered Register Contoller Method");
		customer.setPassword(passwordencoder.encode(customer.getPassword()));
	Customer Savedcustomer =repo.save(customer);
	ResponseEntity<Object> response = null;
	try {
	if(Savedcustomer.getId()>0) {
		response = ResponseEntity.status(HttpStatus.CREATED)
				.body("Customer details have beed stored succesfully");
		
	}
	}catch(Exception ex) {
		response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body("Something went Wrong user not saved"+ex);
	}
	
	return response ;
	}
	
	}

