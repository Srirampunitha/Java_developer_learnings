package com.sriram.sb.MyFisrtwebApp.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
      
	@RequestMapping("/say-hello")
	@ResponseBody
	public String  sayHello() {
		return "Hey I am Sriram's first webapp using SB!";
	}
	
	@RequestMapping("/say-hello-jsp")
	public String  sayHelloJsp() {
		return "sayhello";
	}
}
