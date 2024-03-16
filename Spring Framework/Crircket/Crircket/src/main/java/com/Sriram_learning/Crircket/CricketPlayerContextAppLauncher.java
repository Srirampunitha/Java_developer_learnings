package com.Sriram_learning.Crircket;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CricketPlayerContextAppLauncher {

	public static void main(String[] args) {
		var context = 
				new AnnotationConfigApplicationContext
				          (CricketPlayerContextAppLauncher.class);
            String[] chunks = context.getBeanDefinitionNames();
            for(String beans : chunks) {
            	System.out.println(beans);
            }
            
            context.getBean(PlayerRecord.class).palyerdetails();
	}

}
