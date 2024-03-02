package com.learning.spring_learning.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pacman implements Gamingcontrolls {

	
	  public void Up() {
		   System.out.println("up");
	   }
		public void Down() {
			   System.out.println("Down");
		   }
		public void Right() {
			   System.out.println("Right");
		   }
		public void Left() {
			   System.out.println("Left");
		   }

}
