package com.learning.spring_learning.examples.a2;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BuisnessDataServiceCalculation {
   
	//Field Dependency Injection
	//@Autowired
	private DataService dataservice ; 
  	
   //Setter Dependency Injection
  //@Autowired
    public void setDataservice(DataService dataservice) {
		this.dataservice = dataservice;
	}

     //constructor Dependency Injection
    public BuisnessDataServiceCalculation(@Qualifier("mySqlServicequalifier")DataService dataservice) {
		super();
		this.dataservice = dataservice;
	} 
    
	public int findmax() {
    	int[] data =  dataservice.retrivedata();
    	Arrays.sort(data);
    	return data[data.length-1];
    }	
}
