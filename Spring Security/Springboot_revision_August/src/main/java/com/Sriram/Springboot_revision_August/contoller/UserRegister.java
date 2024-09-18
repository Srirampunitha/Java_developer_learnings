package com.Sriram.Springboot_revision_August.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sriram.Springboot_revision_August.entity.Boys;
import com.Sriram.Springboot_revision_August.repository.BoysRepo;

@RestController
public class UserRegister {
	 
	@Autowired
	private BoysRepo repo;
	
	@Autowired
	private PasswordEncoder passwordencoder;
	
  
	@PostMapping("/register")
	public Object userRegister(@RequestBody Boys boys) {
		if(boys!=null) {
		String encoded_password = passwordencoder.encode(boys.getPassword());
		boys.setPassword(encoded_password);
		Boys bos = repo.save(boys);
		if(bos.getId()>0) {
			return new ResponseEntity<>("User "+bos.getUsername()+" has registerd successfully" ,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>("something went bad check your request" ,HttpStatus.BAD_REQUEST);
		}
		}else {
			return new ResponseEntity<>("values boys is null check the request",HttpStatusCode.valueOf(404));
		}
	}
  
}
