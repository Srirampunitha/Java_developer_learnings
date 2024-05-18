package com.Sriram.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Currency_Exchange")
public class CurrencyExchange {
	
	@Id
    private long id;
	@Column(name="Currency_from")
    private String from;
	@Column(name="Currency_to")
    private String to;
    private BigDecimal conversionmultiple;
    private String environment;
	
    
    public CurrencyExchange(long id, String from, String to, BigDecimal conversionmultiple, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionmultiple = conversionmultiple;
		this.environment = environment;
	}
	
    public CurrencyExchange() {
		super();
	
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
	public BigDecimal getConversionmultiple() {
		return conversionmultiple;
	}
	public void setConversionmultiple(BigDecimal conversionmultiple) {
		this.conversionmultiple = conversionmultiple;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", from=" + from + ", to=" + to + ", conversionmultiple="
				+ conversionmultiple + ", environment=" + environment + "]";
	}
    
    
}
