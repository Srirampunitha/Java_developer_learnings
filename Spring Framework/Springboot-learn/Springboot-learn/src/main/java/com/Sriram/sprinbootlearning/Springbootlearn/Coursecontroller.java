package com.Sriram.sprinbootlearning.Springbootlearn;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Coursecontroller {
    
	    @GetMapping("/courses") 
	    
	    
	 
	   @ResponseBody
     public	 List<Courses> coursedata(){
		
	    	return Arrays.asList(new Courses(21 , "AWS" , "Sriram"),
				new Courses(21 , "AWS" , "Sriram"),
				new Courses(67,"Azure" ,"sriram"),
				new Courses(610,"Devops" ,"sriram"));
	}
	
}
