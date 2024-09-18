package com.Sriram.RestApi.Wing1_demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sriram.RestApi.Wing1_demo.Model.Customers;
import com.Sriram.RestApi.Wing1_demo.repository.CustomersRepository;

@RestController
public class CutomersContoller {
    @Autowired  
	private PasswordEncoder pe;
    @Autowired
	private CustomersRepository repo;
	
	@PostMapping("/register")
	public Object addUsers(@RequestBody Customers customers) {
		String pwd = pe.encode(customers.getPassword());
		customers.setPassword(pwd);
		Customers cust = repo.save(customers);
		if(cust.getId()>0) {
			return new ResponseEntity<>("users registered succesfully",HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>("users not registered succesfully",HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/users")
	public Object getusersdetail(Authentication auth) {
		return repo.findByUsername(auth.getName());
	}

}
