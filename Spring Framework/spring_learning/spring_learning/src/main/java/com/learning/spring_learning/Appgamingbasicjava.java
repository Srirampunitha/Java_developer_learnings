package com.learning.spring_learning;

import com.learning.spring_learning.game.Gamerunner;
import com.learning.spring_learning.game.MarioGame;
import com.learning.spring_learning.game.Pacman;
import com.learning.spring_learning.game.SuperContra;

public class Appgamingbasicjava {

	public static void main(String[] args) {
		
		  //Pacman game = new Pacman();
		   SuperContra game = new SuperContra();
		//MarioGame game = new MarioGame();
		  Gamerunner gamerunner = new Gamerunner(game);
          gamerunner.run();
	}

}
