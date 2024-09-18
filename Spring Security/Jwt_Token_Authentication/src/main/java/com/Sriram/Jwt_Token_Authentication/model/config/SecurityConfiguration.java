package com.Sriram.Jwt_Token_Authentication.model.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.Sriram.Jwt_Token_Authentication.repo.CustomerRepo;

import jakarta.servlet.Filter;
import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {
    private final JwtAuthenticationFilter jwtauthfilter;
    private final AuthenticationProvider authprovider;  
	@Bean
	public SecurityFilterChain securityfilterchain(HttpSecurity http) throws Exception {
		http.csrf().ignoringRequestMatchers("/register" , "/login")
		.and()
		.authorizeHttpRequests(req->req.requestMatchers("/register/**" , "/login/**").permitAll()
				.anyRequest().authenticated())
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.authenticationProvider(authprovider)
		.addFilterBefore(jwtauthfilter, UsernamePasswordAuthenticationFilter.class);
     return http.build();
	}
	
	
}
