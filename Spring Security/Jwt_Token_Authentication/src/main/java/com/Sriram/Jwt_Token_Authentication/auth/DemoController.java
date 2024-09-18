package com.Sriram.Jwt_Token_Authentication.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/hello")
	public String helloSecuredApi() {
		return "Hello I am the response from Secured APi" ;
	}

}
