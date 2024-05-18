package com.RestApi.Wings_Learning.Wings_Learning.Student.security;

import java.time.Instant;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimbusds.jwt.JWTClaimsSet;

@RestController
public class jwtResource {
@Autowired
private JwtEncoder jwtencoder;
  
@GetMapping("/jwtAuthenticationToken")
public JwtResponse jwtresponse(Authentication authenticate) {
   return new JwtResponse(createToken(authenticate));
}
private String createToken(Authentication authenticate) {
	var claim = JwtClaimsSet.builder().issuer("Self")
			.issuedAt(Instant.now())
			.expiresAt(Instant.now().plusSeconds(30*60))
			.subject(authenticate.getName())
			.claim("Scope", createscope(authenticate))
			.build();
		
	JwtEncoderParameters jwtparameter =JwtEncoderParameters.from(claim) ;
	return jwtencoder.encode(jwtparameter).getTokenValue() ;
}
private String createscope(Authentication authenticate) {
	return authenticate.getAuthorities().stream().map(a -> a.getAuthority()).collect(Collectors.joining(" "));
	
}
record JwtResponse(String token) {};	
}
