package com.Sriram.RestApi.WareHouseStore.product.security;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPublicKey;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeySourceException;
import com.nimbusds.jose.jwk.*;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;

import java.util.List;
import java.util.UUID;

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

@Configuration
public class JWTAuthentication {
    
	
	@Bean
	public SecurityFilterChain filter(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
		http.httpBasic();
		http.csrf().disable();
		http.headers().frameOptions().disable();
		http.oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt); 
		return http.build();
	}
	
	@Bean
	public UserDetailsService userdetail(DataSource dataSource) {
           
		UserDetails user1 = User.withUsername("Aarthi")
				.password("Aarthi2505")
				.passwordEncoder(str -> passwordencoder().encode(str))
				.roles("Admin")
				.build();
		  JdbcUserDetailsManager jdbcuserdetail = new JdbcUserDetailsManager(dataSource);
		  jdbcuserdetail.createUser(user1);
		  return jdbcuserdetail;
		//return new InMemoryUserDetailsManager(user1);
	}
	
	@Bean
	public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DataSource datasource() {
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.addScript(JdbcDaoImpl.DEFAULT_USER_SCHEMA_DDL_LOCATION)
				.build();
	}
	
	@Bean
	public KeyPair keypair()  {
		
			try {
				var keypair = KeyPairGenerator.getInstance("RSA");
				keypair.initialize(2048);
				return keypair.generateKeyPair();

			} catch (Exception e) {
			   throw new RuntimeException();
			}
				}
	
	@Bean
	public com.nimbusds.jose.jwk.RSAKey rsakey(KeyPair keypair) {
		var rsakey = new com.nimbusds.jose.jwk.RSAKey.Builder((RSAPublicKey) keypair.getPublic())
				.privateKey(keypair.getPrivate())
				.keyID(UUID.randomUUID().toString())
				.build();
		
		return rsakey;
		
	}	
	
	@Bean
	public JWKSource<SecurityContext> jwksource(com.nimbusds.jose.jwk.RSAKey rsakey){
		var jwkset = new JWKSet(rsakey);
		var jwksource = new JWKSource<SecurityContext>() {

			@Override
			public List<JWK> get(JWKSelector jwkSelector, SecurityContext context) throws KeySourceException {
				// TODO Auto-generated method stub
				return jwkSelector.select(jwkset);
			}
		};		
		return jwksource;
	}
	@Bean
	public JwtDecoder jwtdecoder(com.nimbusds.jose.jwk.RSAKey rsakey) throws JOSEException {
		return NimbusJwtDecoder
				.withPublicKey(rsakey.toRSAPublicKey())
				.build();
	}
	
	@Bean
	public JwtEncoder jwtencoder(JWKSource<SecurityContext> jwksource) {
		return new NimbusJwtEncoder(jwksource);
	}
}
