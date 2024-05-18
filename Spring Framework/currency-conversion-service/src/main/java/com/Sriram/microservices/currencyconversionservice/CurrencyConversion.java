package com.Sriram.microservices.currencyconversionservice;

import java.math.BigDecimal;

import jakarta.persistence.Column;

public class CurrencyConversion {
	private long id;
    private String from;
    private String to;
    private BigDecimal quantity;
    private BigDecimal conversionmultiple;
    private BigDecimal calculatedAmmount;
    private String environment;
	
    public CurrencyConversion() {
		super();
		
	}

	public CurrencyConversion(long id, String from, String to, BigDecimal quantity, BigDecimal conversionmultiple,
			BigDecimal calculatedAmmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionmultiple = conversionmultiple;
		this.calculatedAmmount = calculatedAmmount;
		this.environment = environment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getConversionmultiple() {
		return conversionmultiple;
	}

	public void setConversionmultiple(BigDecimal conversionmultiple) {
		this.conversionmultiple = conversionmultiple;
	}

	public BigDecimal getCalculatedAmmount() {
		return calculatedAmmount;
	}

	public void setCalculatedAmmount(BigDecimal calculatedAmmount) {
		this.calculatedAmmount = calculatedAmmount;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", from=" + from + ", to=" + to + ", quantity=" + quantity
				+ ", conversionmultiple=" + conversionmultiple + ", calculatedAmmount=" + calculatedAmmount
				+ ", environment=" + environment + "]";
	}
    
    
}
