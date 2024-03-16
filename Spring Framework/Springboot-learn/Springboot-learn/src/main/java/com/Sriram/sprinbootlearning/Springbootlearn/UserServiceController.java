package com.Sriram.sprinbootlearning.Springbootlearn;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {
    @Autowired
	private Userservice userservice ;
	    @GetMapping("/userservice") 
     public	 Userservice retrieve(){
		
	    	return userservice;
	}
	
}
