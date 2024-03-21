package com.sriram.sb.MyFisrtwebApp.login.authentication;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
      
	public boolean isValidUser(String name , String password) {
		 boolean isValidusername = name.equalsIgnoreCase("Sriram");
		  boolean isvalidpassword = password.equalsIgnoreCase("Sri542@ap");
		  
		  return isValidusername&&isvalidpassword;
	}
	
}
