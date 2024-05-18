package com.Sriram.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchnageRepository extends JpaRepository<CurrencyExchange, Long> {
 
	public CurrencyExchange findByFromAndTo(String from ,String to);
}
