package com.learning.spring_learning.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("supercontra")
public class SuperContra implements Gamingcontrolls {
	
	
       public void Up() {
		   System.out.println("Jump");
	   }
		public void Down() {
			   System.out.println("Sit Down");
		   }
		public void Right() {
			   System.out.println("Firing Bulllets");
		   }
		public void Left() {
			   System.out.println("Backward run");
		   }

}
