package com.RestApi.Wings_Learning.Wings_Learning.Student.security;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeySourceException;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKSelector;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;

@Configuration
public class StudentSecurityJWTAuthentication {
	
	@Bean
	public SecurityFilterChain filterchain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(req -> req.anyRequest().authenticated());
		http.httpBasic();
		http.csrf().disable();
		http.headers().frameOptions().disable();
		http.oauth2ResourceServer( OAuth2ResourceServerConfigurer::jwt);
		
		return http.build();
	}
         
	@Bean
	public UserDetailsService userdetails(DataSource datasource) {
		
		UserDetails user1 = User.withUsername("sriram")
				.password("Sri542@ap")
				.passwordEncoder(str -> passwordencoder().encode(str))
                .roles("Admin")
                .build();
		UserDetails user2 = User.withUsername("Varun")
				.password("Sri542@ap")
				.passwordEncoder(str -> passwordencoder().encode(str))
                .roles("user")
                .build();
	 JdbcUserDetailsManager jdbcmanger = new JdbcUserDetailsManager(datasource);	
	     jdbcmanger.createUser(user2);
	     jdbcmanger.createUser(user1);
	     return jdbcmanger;
	}
	
	@Bean
	public DataSource datasource() {
		
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
				.addScript(JdbcDaoImpl.DEFAULT_USER_SCHEMA_DDL_LOCATION)
				.build();
	}
	
	@Bean
	public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
	
	//JwT authentication Implementation 
	
	@Bean
	public KeyPair keypair() {
	   try {
		var kp =  KeyPairGenerator.getInstance("RSA");
		kp.initialize(2048);
		return kp.generateKeyPair();
	} catch (Exception e) {
		
		throw new RuntimeException();
	}
	   
	}
	
	@Bean
	public RSAKey rsakey(KeyPair keypair) {
		return new RSAKey.Builder((RSAPublicKey) keypair.getPublic())
				.privateKey(keypair.getPrivate())
				.keyID(UUID.randomUUID().toString())
				.build();
				
	}
	
	@Bean
	public JWKSource<SecurityContext> jwksource(RSAKey rsakey){
	   	var jwkset = new JWKSet(rsakey);
	   	var jwksource = new JWKSource<SecurityContext>() {

			@Override
			public List<JWK> get(JWKSelector jwkSelector, SecurityContext context) throws KeySourceException {
			
				return jwkSelector.select(jwkset);
			}
		};
		return jwksource;
	}
	
	@Bean
	public JwtDecoder jwtdecoder(RSAKey rsakey) throws JOSEException {
		return NimbusJwtDecoder
				.withPublicKey(rsakey.toRSAPublicKey())
				.build();
	}
	
	@Bean
	public JwtEncoder jwtencoder(JWKSource<SecurityContext> jwksource) {
		return new NimbusJwtEncoder(jwksource);
	}
}
