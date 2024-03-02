package com.learning.spring_learning.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gamerunner {

	private Gamingcontrolls game ;
	  
	public Gamerunner(@Qualifier("pacman")Gamingcontrolls game) {
		this.game= game ;
	}
    
	public void run() {
		System.out.println("Game running is  : " + game );
		game.Down();
		game.Right();
		game.Up();
		game.Left();
	}
}
