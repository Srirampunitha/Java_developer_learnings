package com.Sriram.RestApi.Wing1_demo.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import com.Sriram.RestApi.Wing1_demo.filters.JwtTokengeneratorFilter;

import jakarta.servlet.http.HttpServletRequest;

@Configuration
public class SecurityConfig {
    
	@Bean
	public SecurityFilterChain securityfilter(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeHttpRequests(req -> req.requestMatchers("/students/**").authenticated()
				.requestMatchers("/users").hasRole("ADMIN")
				.requestMatchers("/register","/h2-console").permitAll());
				
		http.httpBasic();
		http.addFilterAfter(new JwtTokengeneratorFilter(), BasicAuthenticationFilter.class);
		http.addFilterBefore(new JwtTokengeneratorFilter(), BasicAuthenticationFilter.class);
		
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.cors(corscustomizer -> corscustomizer.configurationSource(new CorsConfigurationSource() {
			
			@Override
			public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
				CorsConfiguration config = new CorsConfiguration();
				config.setAllowedOriginPatterns(Collections.singletonList("localhost:8081"));
				config.setAllowCredentials(true);
				config.setAllowedMethods(Collections.singletonList("*"));
				config.setAllowedHeaders(Collections.singletonList("*"));
				config.setMaxAge(200000L);
				return config;
			}
		}));
		   http.headers().frameOptions().disable();
		return http.build();
		
		
	}
	
	@Bean
	public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
}
