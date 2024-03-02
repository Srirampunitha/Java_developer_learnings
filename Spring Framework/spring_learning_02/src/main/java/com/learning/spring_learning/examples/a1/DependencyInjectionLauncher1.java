package com.learning.spring_learning.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.learning.spring_learning.game.Gamerunner;
import com.learning.spring_learning.game.Gamingcontrolls;



//criket
//Team1 - dependency 1
//Team2 - dependecy -2 

@Component
class Cricket
{
  
  Team1 team1; 
  Team2 team2;
  

public void setTeam1(Team1 team1) {
	this.team1 = team1;
}

@Autowired
public Cricket(Team1 team1, Team2 team2) {
	super();
	this.team1 = team1;
	this.team2 = team2;
}


public void setTeam2(Team2 team2) {
	this.team2 = team2;
}

public String toString() {
	  return "team1-dependency :" + team1 + " and team2-dependency :"+ team2;
  }
}
@Component
class Team1{
	
}
@Component
class Team2{
	
}

@Configuration
@ComponentScan
public class DependencyInjectionLauncher1 { 
	
	public static void main(String[] args) {
		
		try( var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncher1.class)){
			String[] chunks = context.getBeanDefinitionNames();
			for(String chunk : chunks) {
				System.out.println(chunk);
			}
			
			System.out.println(context.getBean(Cricket.class));
		}

	}

}
