package com.learning.spring_learning.examples.a6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learning.spring_learning.game.Gamerunner;
import com.learning.spring_learning.game.Gamingcontrolls;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
class BuisnessSerive{
	private DataService dataservice;
     
	@Inject
	public void setDataservice(DataService dataservice) {
		this.dataservice = dataservice;
	}
	
	public DataService getDataservice() {
		return dataservice;
	}	
}

@Named
class DataService{
	
}

@Configuration
@ComponentScan
public class CDI_LauncherApplication {   
	public static void main(String[] args) {
		
		try( var context = new AnnotationConfigApplicationContext(CDI_LauncherApplication.class)){
		      System.out.println(context.getBean(BuisnessSerive.class).getDataservice());	
		}

	}

}
