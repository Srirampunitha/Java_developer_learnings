package com.learning.spring_learning.examples.a7;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring_learning.game.Gamerunner;
import com.learning.spring_learning.game.Gamingcontrolls;


public class XmlConfigurationContextLauncher {   
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext
				   ("xmlcontextconfiguration.xml");
		String[] str = context.getBeanDefinitionNames();
          for(String chunks :str){
        	 System.out.println(chunks); 
          }
         context.getBean(Gamerunner.class).run();
	}

}
