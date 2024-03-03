package com.learning.spring_learning.examples.a0;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learning.spring_learning.game.Gamerunner;
import com.learning.spring_learning.game.Gamingcontrolls;

@Configuration
@ComponentScan
public class DependencyInjectionLauncher {   
	public static void main(String[] args) {
		
		try( var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncher.class)){
			
		}

	}

}
