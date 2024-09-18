package com.Sriram.restapi.Revising_Springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class RoomatesConfiguration {
     
	@Bean
	public SecurityFilterChain securityfilter(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(req -> req.anyRequest().authenticated()).csrf().disable()
		.httpBasic()
		.and()
		.headers().frameOptions().disable();
		return http.build();
	}
}
