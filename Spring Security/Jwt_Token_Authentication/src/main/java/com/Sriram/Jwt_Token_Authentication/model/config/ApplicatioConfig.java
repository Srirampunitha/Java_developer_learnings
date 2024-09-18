package com.Sriram.Jwt_Token_Authentication.model.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.Sriram.Jwt_Token_Authentication.repo.CustomerRepo;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class ApplicatioConfig {

	
	private final CustomerRepo repo;
	
	@Bean
	public UserDetailsService userdetailservice() {
		
		return (username) -> repo.findByMail(username)
				.orElseThrow(()->new UsernameNotFoundException("user " +username + " not found"));
	
	}
	
	@Bean
	public AuthenticationProvider authenticationprovider() {
		DaoAuthenticationProvider authprovider = new DaoAuthenticationProvider();
		authprovider.setUserDetailsService(userdetailservice());
		authprovider.setPasswordEncoder(passwordencoder());
		return authprovider;
	}
	
	@Bean
	public AuthenticationManager authenticationmanager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}
      
	@Bean
	public PasswordEncoder passwordencoder() {	
		return new BCryptPasswordEncoder();
	}

}
