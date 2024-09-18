package com.Sriram.Restfull.Cricket.player.security;


import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPublicKey;
import java.util.List;
import java.util.UUID;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeySourceException;
import com.nimbusds.jose.jwk.* ;
import com.nimbusds.jose.jwk.RSAKey.Builder;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;

import javax.sql.DataSource;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.boot.autoconfigure.security.oauth2.resource.servlet.JwkSetUriJwtDecoderBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class JwtAuthentication {
     
	private KeyPair keypair;

	@Bean
	public SecurityFilterChain securityFiter(HttpSecurity http) throws Exception {
		  
		http.authorizeHttpRequests(auth->auth.anyRequest().authenticated());
		http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		http.httpBasic();
		http.csrf().disable();
		http.headers().frameOptions().sameOrigin();
		http.oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);		
		return http.build();
	}
	
	@Bean
	public UserDetailsService userDetail(DataSource datasource) {
		
		UserDetails user1 = User.withUsername("Sriram")
				.password("Sri542@ap")
				.passwordEncoder(str -> passwordEncoder().encode(str))
				.roles("ADMIN")
				.build();
		UserDetails user2 = User.withUsername("Varun")
				.password("Sri542@ap")
				.passwordEncoder(str -> passwordEncoder().encode(str))
				.roles("USER")
				.build();
		
	JdbcUserDetailsManager  jdbcuserdetailmanager =	new JdbcUserDetailsManager(datasource);
	jdbcuserdetailmanager.createUser(user2);
	jdbcuserdetailmanager.createUser(user1);
		return  jdbcuserdetailmanager;
	}
	
	@Bean
	public DataSource datasource() {
		
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.addScript(JdbcDaoImpl.DEFAULT_USER_SCHEMA_DDL_LOCATION)
				.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public KeyPair keypair() {
		try {
		var keypair = KeyPairGenerator.getInstance("RSA");
		keypair.initialize(2048);
		return keypair.generateKeyPair();
	
		} catch (Exception e) {
		throw new RuntimeException(e);
		}
		
	}
	@Bean
	public RSAKey rsakey(KeyPair keypair) {
		var rsakey = new RSAKey.Builder((RSAPublicKey)keypair.getPublic())
	     .privateKey(keypair.getPrivate())
	     .keyID(UUID.randomUUID().toString())
	     .build();
	   return rsakey;
	}
	
	@Bean
	public JWKSource<SecurityContext> jwksource(RSAKey rsakey){
		var jwkset = new JWKSet(rsakey);
  var jwksource	= new JWKSource<SecurityContext>() {

	@Override
	public List<JWK> get(JWKSelector jwkSelector, SecurityContext context) throws KeySourceException {
		// TODO Auto-generated method stub
		return jwkSelector.select(jwkset);
	}
}; 
	
		//return (jwkSelector,context) -> jwkSelector.select(jwkset);
        return jwksource ;
	}
	
	@Bean
	public  JwtDecoder jwtdecoder(RSAKey rsakey) throws JOSEException {
    
		return NimbusJwtDecoder
				.withPublicKey(rsakey.toRSAPublicKey())
                .build();
	}
	
	@Bean
	public JwtEncoder jwtencoder(JWKSource<SecurityContext> jwksource) {
		return new NimbusJwtEncoder(jwksource);
	}
	
	
}
