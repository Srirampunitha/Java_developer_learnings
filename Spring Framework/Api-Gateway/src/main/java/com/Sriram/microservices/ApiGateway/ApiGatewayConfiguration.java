package com.Sriram.microservices.ApiGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
    
	@Bean
	public RouteLocator gatewayrouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/currencyConversion-Feign/**")
						.uri("lb://CURRENCY-CONVERSION-SERVICE")
						)
				.route(p -> p.path("/currencyConversion/**")
						.uri("lb://CURRENCY-CONVERSION-SERVICE"))
				.route(p -> p.path("/currencyExchange/**")
						.uri("lb://CURRENCY-EXCHANGE-SERVICE"))
				.route(p -> p.path("/currencyConversionRate/**")
						.filters(f -> f.rewritePath("/currencyConversionRate/(?<segment>.*)","/currencyConversion-Feign/${segment}"))
						.uri("lb://CURRENCY-CONVERSION-SERVICE"))
				.build();
				
	}
}
