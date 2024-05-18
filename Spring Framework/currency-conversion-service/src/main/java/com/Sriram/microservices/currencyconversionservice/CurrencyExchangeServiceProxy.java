package com.Sriram.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



//@FeignClient(name="currency-exchange-service",url="localhost:8000")
@FeignClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
       
	@GetMapping("/currencyExchange/from/{from}/to/{to}")
	public CurrencyConversion cureencyExchange(@PathVariable String from, @PathVariable String to);
}
