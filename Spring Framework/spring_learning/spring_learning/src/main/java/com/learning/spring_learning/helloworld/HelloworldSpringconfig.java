package com.learning.spring_learning.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person (String name , int age , Address address) {};

record Address (String Address , String city) {};

@Configuration
public class HelloworldSpringconfig {
    
	@Bean
	public String name() {
		return "Sriram";
	}
	
	@Bean
	public int age() {
		return 24 ;
	}
	
	@Bean
	public Person person1() {
		return new Person("Kumaruu" , 29 , new Address("1st street", "Kumbakonam"));
	}
	
	@Bean
	@Primary
	public Person person2(String name , int age , @Qualifier(value ="qualifiedaddress") Address address) {
		return new Person(name , age , address);
	}
	@Bean(name="address1")
	@Primary
	public Address address2() {
		return new Address("Middle street" , "Inam kiliyur");
	}
	
	@Bean(name = "address0")
	@Qualifier(value ="qualifiedaddress")
	public Address address() {
		return new Address("muslim street" , "Govindhakudi");
	}
}
