package com.Sriram.Springboot_revision_August.config;

import java.net.PasswordAuthentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;

import com.Sriram.Springboot_revision_August.filter.FIlterAfterAuthentication;

@Configuration
public class HouseRentConfiguration {
	
	
/*	@Bean
	public InMemoryUserDetailsManager userdetails() {
		
		UserDetails user1 = User.withUsername("Sriram")
				.password("Sriram")
				.passwordEncoder(pwd->passwordencoder().encode(pwd))
				.roles("Admin","User")
				.build();
		UserDetails user2 = User.withUsername("Aarthi")
				.password("Aarthi")
				.passwordEncoder(pwd->passwordencoder().encode(pwd))
				.roles("user")
				.build();
		UserDetails user3 = User.withUsername("Kishore")
				.password("Kishore")
				.passwordEncoder(pwd->passwordencoder().encode(pwd))
				.roles("user")
				.build();
		return new InMemoryUserDetailsManager(user1,user2,user3);
	} */ 
    
	@Bean
	public SecurityFilterChain securityfilterchain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				req->req.requestMatchers("/register").permitAll()
				.requestMatchers("/houseRentInfo/**").authenticated()
				.requestMatchers("/houseRentInfoAdmin/**","/h2-console/**")
				.hasAnyAuthority("Admin","User"))
		.addFilterAfter(new FIlterAfterAuthentication(), BasicAuthenticationFilter.class)
		.formLogin(Customizer.withDefaults())
		.httpBasic(Customizer.withDefaults())
		.headers().frameOptions().disable()
		.and().csrf().disable();
		
		return http.build();
	}
	
	@Bean
	public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
}
