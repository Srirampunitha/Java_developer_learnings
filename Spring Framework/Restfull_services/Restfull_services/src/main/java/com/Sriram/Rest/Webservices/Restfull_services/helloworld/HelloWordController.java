package com.Sriram.Rest.Webservices.Restfull_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
     
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloworldbean() {
		return new HelloWorldBean("HELLO WORLD");
	}
	
	@GetMapping(path="/helloworld-bean/path-variable/{name}")
	public HelloWorldBean helloworldbeanPathvariable(@PathVariable String name) {
		return new HelloWorldBean("HELLO WORLD :" + name);
	}
}
