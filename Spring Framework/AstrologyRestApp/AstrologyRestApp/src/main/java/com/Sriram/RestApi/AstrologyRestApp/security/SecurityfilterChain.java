package com.Sriram.RestApi.AstrologyRestApp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityfilterChain {
    
	@Bean
	public DefaultSecurityFilterChain filterchain(HttpSecurity http ) throws Exception {
          http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
          http.httpBasic(withDefaults());
          http.csrf().disable();
          return http.build();
	}
}
