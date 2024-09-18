package com.Sriram.Spring.SpringSecurityLearning.Security;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
	
 
     @Bean
   public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
	   System.out.println("entered Security fileter bean");
	   http.csrf().ignoringRequestMatchers("/register/**").and()
	   .authorizeHttpRequests((request) -> request.requestMatchers("/notices","/register").permitAll()
			   .requestMatchers("/balance","/transaction","/mycards").authenticated())
	   .formLogin(Customizer.withDefaults())
	  .httpBasic(Customizer.withDefaults());
	   return http.build();
   }
   
//   @Bean
//   public UserDetailsService userdetails(DataSource datasource) {
////	   UserDetails user1 = User.withUsername("Sriram")
////			   .password("Sri542@ap")
////			   .passwordEncoder(pwd -> passwordencoder().encode(pwd))
////			   .authorities("admin")
////			   .build();
////	   UserDetails user2 = User.withUsername("Aarthi")
////			   .password("Aarthi2505")
////			   .passwordEncoder(pwd -> passwordencoder().encode(pwd))
////			   .authorities("read")
////			   .build();
////	   
////	   return new InMemoryUserDetailsManager(user1,user2);
//	   
//	   return new JdbcUserDetailsManager(datasource);
//   }
   
  
   @Bean
   public PasswordEncoder passwordencoder() {
	     return  new BCryptPasswordEncoder(); 
   }
   
}
