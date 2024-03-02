package com.learning.spring_learning.game;

public class Gamerunner {

	private Gamingcontrolls game ;
	  
	public Gamerunner(Gamingcontrolls game) {
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
