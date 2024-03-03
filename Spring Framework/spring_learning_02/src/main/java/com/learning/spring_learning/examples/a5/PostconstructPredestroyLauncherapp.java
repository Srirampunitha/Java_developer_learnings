package com.learning.spring_learning.examples.a5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.learning.spring_learning.game.Gamerunner;
import com.learning.spring_learning.game.Gamingcontrolls;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class SomeClass{
	
	private SomeDependency somedependency;
	public SomeClass(SomeDependency somedependency) {
		System.out.println("Bean has been Initialized");
	    this.somedependency =somedependency;	
	}
	
	@PostConstruct
	public void retrievemethod() {
		somedependency.somemethod();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleaned");
	}
	
}

@Component
class SomeDependency {
	public void somemethod() {
		System.out.println("hey i am some method");
	}
}
@Configuration
@ComponentScan
public class PostconstructPredestroyLauncherapp {   
	public static void main(String[] args) {
		
		try( var context = new AnnotationConfigApplicationContext(PostconstructPredestroyLauncherapp.class)){
			context.getBean(SomeClass.class).retrievemethod();
		}

	}

}
