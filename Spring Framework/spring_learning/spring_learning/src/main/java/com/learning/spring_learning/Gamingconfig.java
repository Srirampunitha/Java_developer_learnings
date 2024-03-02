package com.learning.spring_learning;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.spring_learning.game.Gamerunner;
import com.learning.spring_learning.game.Gamingcontrolls;
import com.learning.spring_learning.game.MarioGame;
import com.learning.spring_learning.game.SuperContra;

@Configuration
public class Gamingconfig {
     @Bean(name = "gamecontrol")
	public Gamingcontrolls gamecontroll() {
		//SuperContra game = new SuperContra();
		MarioGame game = new MarioGame();
		return game ;
	}
     
     @Bean
	public Gamerunner gamerunner(Gamingcontrolls gamecontrol) {
		Gamerunner gamerunner = new Gamerunner(gamecontrol);
		return gamerunner ;
	}
}
