package com.Sriram.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private Environment env;
	
	@Autowired
	private CurrencyExchnageRepository repo;
	
	@GetMapping("/currencyExchange/from/{from}/to/{to}")
	public CurrencyExchange cureencyExchange(@PathVariable String from, @PathVariable String to) {
		String port = env.getProperty("local.server.port");
		CurrencyExchange currencyexchange = repo.findByFromAndTo(from, to);
		currencyexchange.setEnvironment(port);
		return currencyexchange;
	}
}
