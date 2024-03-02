package com.learning.spring_learning.helloworld;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01helloworldspring {

	public static void main(String[] args) {
		
		//1:Creating a Spring Container in JVM
		//2:creating a config class that we want to managed by a spring container
		//3: Retrieving bean methods which is handled by Spring container
		try (
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloworldSpringconfig.class)) {
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		

		
//		String [] beanlists = context.getBeanDefinitionNames();
//		for(String str : beanlists) {
//			System.out.println(str + " ");
//		}
	}

}
