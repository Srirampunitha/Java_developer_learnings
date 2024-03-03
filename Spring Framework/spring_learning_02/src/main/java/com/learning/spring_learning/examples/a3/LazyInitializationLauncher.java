package com.learning.spring_learning.examples.a3;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.learning.spring_learning.game.Gamerunner;
import com.learning.spring_learning.game.Gamingcontrolls;

@Component
@Lazy
class TeamA {
	
}

@Component
@Lazy
class TeamB{
	private TeamA teama;
	
	public TeamB(TeamA teama) {
		System.out.println("Bean Inizialition Happened");
		this.teama = teama;
	}
	
}


@Configuration
@ComponentScan
public class LazyInitializationLauncher {   
	public static void main(String[] args) {
		
		try( var context = new AnnotationConfigApplicationContext(LazyInitializationLauncher.class)){
			System.out.println("spring context Launcher");
			context.getBean(TeamB.class);
		}

	}

}
