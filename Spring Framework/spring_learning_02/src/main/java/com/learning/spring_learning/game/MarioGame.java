package com.learning.spring_learning.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Mariogamequalifier")
public class MarioGame implements Gamingcontrolls{
   
	public void Up() {
	   System.out.println("Jump");
   }
	public void Down() {
		   System.out.println("Go into the hole");
	   }
	public void Right() {
		   System.out.println("Run forward");
	   }
	public void Left() {
		   System.out.println("Run Backward ");
	   }
}
