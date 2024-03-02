package com.learning.spring_learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.spring_learning.game.Gamerunner;
import com.learning.spring_learning.game.Gamingcontrolls;

public class App02gamingspring {

	public static void main(String[] args) {
		
		try( var context = new AnnotationConfigApplicationContext(Gamingconfig.class)){
			context.getBean(Gamingcontrolls.class).Right();
			context.getBean(Gamerunner.class).run();
		}

	}

}
