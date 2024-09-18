package com.Sriram.Jwt_Token_Authentication.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sriram.Jwt_Token_Authentication.model.Customer;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {
	
   @Autowired
private  AuthenticateService authService;
      
	@PostMapping("/register")
	public ResponseEntity<AuthenticationResponse> userRegisteration(@RequestBody RegisterRequest request){
		System.out.println("the value of email from requestbody: " +request.getEmail());
		return ResponseEntity.ok(authService.registerUser(request));
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<AuthenticationResponse> loginUser(@RequestBody LoginRequest request ){
		return ResponseEntity.ok(authService.loginUser(request));
	}
}
