package com.Sriram.Microservices.Limitsservice.limitService;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="limits-service")
public class LimitsConfigurationClass {
  private int minimum;
  private int maximum;
public LimitsConfigurationClass(int minimum, int maximum) {
	super();
	this.minimum = minimum;
	this.maximum = maximum;
}
public LimitsConfigurationClass() {
	super();
	// TODO Auto-generated constructor stub
}
public int getMinimum() {
	return minimum;
}
public void setMinimum(int minimum) {
	this.minimum = minimum;
}
public int getMaximum() {
	return maximum;
}
public void setMaximum(int maximum) {
	this.maximum = maximum;
}
@Override
public String toString() {
	return "LimitsConfigurationClass [minimum=" + minimum + ", maximum=" + maximum + "]";
}
  
}
