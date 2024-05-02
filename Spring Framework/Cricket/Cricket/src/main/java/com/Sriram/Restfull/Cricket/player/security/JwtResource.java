package com.Sriram.Restfull.Cricket.player.security;

import java.time.Instant;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimbusds.jwt.JWTClaimsSet;

@RestController
public class JwtResource {
	
	@Autowired
	private JwtEncoder jwtencoder;
	
     
	@PostMapping("/authenticate")
	public JwtReponse authenticate( Authentication authenticate) {
		
		return new JwtReponse(createToken(authenticate));
	}
		
	private String createToken(Authentication authenticate) {
		var claim = JwtClaimsSet.builder()
		.issuer("Self")
		.issuedAt(Instant.now())
		.expiresAt(Instant.now().plusSeconds(30*60))
		.subject(authenticate.getName())
		.claim("Scope", createScope(authenticate))
		.build();
		
		JwtEncoderParameters parameters = JwtEncoderParameters.from(claim);
		return jwtencoder.encode(parameters).getTokenValue();
		 
	}

	private String createScope(Authentication authenticate) {
		return authenticate.getAuthorities().stream().map(a->a.getAuthority()).collect(Collectors.joining(" "));
		
	}

}

record JwtReponse(String token) {}
