package com.sriram.sb.MyFisrtwebApp.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.relational.core.dialect.InsertWithDefaultValues;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
public class SecurityConfiguration {

	@Bean
	public InMemoryUserDetailsManager createUserdetails() {

		UserDetails userdetails1 = createUserDetails("Sriram", "Sri542@ap");
		UserDetails userdetails2 = createUserDetails("Aarthi", "Aarthi2505");
		return new InMemoryUserDetailsManager(userdetails1, userdetails2);
	}

	private UserDetails createUserDetails(String username, String password) {
		Function<String, String> passwordencoder = input -> passwordencoder().encode(input);
		UserDetails userdetails = User.builder()
										.passwordEncoder(passwordencoder)
										.username(username)
										.password(password)
										.roles("User", "Admin")
										.build();
		return userdetails;
	}

	@Bean
	public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();

	}
	
	@Bean
	public SecurityFilterChain securityfilter(HttpSecurity  http) throws Exception {
		http.authorizeHttpRequests(
		auth -> auth.anyRequest().authenticated() 
		);
		http.formLogin(withDefaults());
		http.csrf().disable();
		http.headers().frameOptions().disable();
		
		
		return http.build();
	}
}
