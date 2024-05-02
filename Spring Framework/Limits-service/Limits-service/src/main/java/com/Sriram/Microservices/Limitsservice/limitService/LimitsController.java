package com.Sriram.Microservices.Limitsservice.limitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
   
	@Autowired
	private LimitsConfigurationClass config;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		
		return new Limits(config.getMinimum(), config.getMaximum());
		//return new Limits(100, 2000);
	}
}
