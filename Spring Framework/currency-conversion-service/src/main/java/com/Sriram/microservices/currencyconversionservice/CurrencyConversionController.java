package com.Sriram.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
      @Autowired
	private CurrencyExchangeServiceProxy proxy;
	@GetMapping("/currencyConversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion 
	currencyconversion(@PathVariable String from,@PathVariable
			String to,@PathVariable BigDecimal quantity)
	{
		   HashMap<String, String> urivariables= new HashMap<>();
		   urivariables.put("from", from);
		   urivariables.put("to", to);
		ResponseEntity<CurrencyConversion> forEntity = new RestTemplate().getForEntity("http://localhost:8000/currencyExchange/from/{from}/to/{to}", CurrencyConversion.class,urivariables);
		CurrencyConversion body = forEntity.getBody();
		return new CurrencyConversion(body.getId(), body.getFrom(), body.getTo(), quantity,body.getConversionmultiple(),quantity.multiply(body.getConversionmultiple()),body.getEnvironment());
	}
	
	@GetMapping("/currencyConversion-Feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion 
	currencyconversionFeign(@PathVariable String from,@PathVariable
			String to,@PathVariable BigDecimal quantity)
	{
		   
		CurrencyConversion body = proxy.cureencyExchange(from, to);
		return new CurrencyConversion(body.getId(),from , to, quantity,body.getConversionmultiple(),quantity.multiply(body.getConversionmultiple()),body.getEnvironment());
	}
}
