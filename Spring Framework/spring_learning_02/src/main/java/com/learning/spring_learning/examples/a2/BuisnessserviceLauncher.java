package com.learning.spring_learning.examples.a2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.learning.spring_learning.game.Gamerunner;
import com.learning.spring_learning.game.Gamingcontrolls;

@Configuration
@ComponentScan
public class BuisnessserviceLauncher { 
	
	public static void main(String[] args) {
		
try (var context = new
                AnnotationConfigApplicationContext
                (BuisnessserviceLauncher.class)) {
	// Retriveing the beans presented in this Spring context :
			String[] chunks = context.getBeanDefinitionNames();
			for(String chunk : chunks) {
				System.out.println(chunk);
			}
			
	//Getting the Integer Array and printing those values:
	//	int [] data = context.getBean(MongoDbService.class).retrivedata();
	//	for(int chunk : data) {
	//		  System.out.print(chunk);
	//		}
	
	//Demonstration of Auto wiring and Dependency Injection
	         System.out.println(context.getBean(BuisnessDataServiceCalculation.class).findmax());
} catch (BeansException e) {
	
	e.printStackTrace();
}
	}
}
