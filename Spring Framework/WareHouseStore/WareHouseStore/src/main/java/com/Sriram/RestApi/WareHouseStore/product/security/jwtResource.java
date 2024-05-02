package com.Sriram.RestApi.WareHouseStore.product.security;

import java.time.Instant;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jwtResource {
    
	@Autowired
	private JwtEncoder jwtencoder;
	
	@GetMapping("/jwtAuthenticationToken")
	public jwtresponse jwtresponse(Authentication authenticate) {
		return new jwtresponse(createToken(authenticate));
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

	record jwtresponse(String token) {}
}
