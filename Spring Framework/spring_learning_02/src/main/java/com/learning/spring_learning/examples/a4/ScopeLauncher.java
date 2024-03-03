package com.learning.spring_learning.examples.a4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.learning.spring_learning.game.Gamerunner;
import com.learning.spring_learning.game.Gamingcontrolls;

@Component
class Normal {
	
}
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
class Prototype {
	
}

@Configuration
@ComponentScan
public class ScopeLauncher {   
	public static void main(String[] args) {
		
		try( var context = new AnnotationConfigApplicationContext(ScopeLauncher.class)){
			System.out.println("Singleton Scope ------------");
			System.out.println(context.getBean(Normal.class));
			System.out.println(context.getBean(Normal.class));
			System.out.println(context.getBean(Normal.class));
			System.out.println("Prototype Scope ------------");
			System.out.println(context.getBean(Prototype.class));
			System.out.println(context.getBean(Prototype.class));
			System.out.println(context.getBean(Prototype.class));
		}

	}

}
