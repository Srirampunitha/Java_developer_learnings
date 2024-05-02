package com.Sriram.Rest.Webservices.Restfull_services.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
	@Autowired
     public MessageSource msgsource;
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
	@GetMapping(path="/hello-world-i18n")
	public String helloworldi18n() {
		Locale locale =LocaleContextHolder.getLocale();
		return msgsource.getMessage("goodmorning.message", null, "default_message", locale );
	}
}
