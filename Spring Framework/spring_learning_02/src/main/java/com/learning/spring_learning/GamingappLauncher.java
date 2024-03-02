package com.learning.spring_learning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learning.spring_learning.game.Gamerunner;
import com.learning.spring_learning.game.Gamingcontrolls;

@Configuration
@ComponentScan("import com.learning.spring_learning.game")
public class GamingappLauncher {   
	public static void main(String[] args) {
		
		try( var context = new AnnotationConfigApplicationContext(GamingappLauncher.class)){
			context.getBean(Gamingcontrolls.class).Right();
			context.getBean(Gamerunner.class).run();
		}

	}

}
