package com.Sriram.Jwt_Token_Authentication.model.config;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Jwts.KEY;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class jwtservice {
	
	private final String Secret_Key = "2bda15585d6616110e829ccddb286270816ea51921ff4de9a46c1a42e70a5dec";

	public String extractUsername(String token) {
		
		return extractAllclaims(token).getSubject();
	}
	
     public <T> T extractClaim(String token , Function<Claims, T> claimresolver) {
    	Claims claim = extractAllclaims(token);
   
    	 return claimresolver.apply(claim);
     }
	
	public Claims extractAllclaims(String token) {
		
	return	 Jwts
		    .parser()
		    .setSigningKey(getSigingKey())
            .build()
		    .parseClaimsJws(token)
		    .getPayload();
		

		
	}
	
	public String generateToken(UserDetails userdetails) {
		return generateToken(new HashMap<>(), userdetails);
	}
	
	public String generateToken(Map<String, Object> extraClaims, UserDetails userDetails) {
		 return Jwts.builder()
				 .setClaims(extraClaims)
				 .setSubject(userDetails.getUsername())
				 .setIssuedAt(new Date(System.currentTimeMillis()))
				 .setExpiration(new Date(System.currentTimeMillis()+1000*60*60*2))
				 .signWith(getSigingKey(), SignatureAlgorithm.HS256)
				 .compact();
	}
	
	public boolean isvalidToken(String token , UserDetails userdetail) {
		return extractUsername(token).equals(userdetail.getUsername())&& !isTokenExpired(token);
	}

	public boolean isTokenExpired(String token) {
	   //return extractClaim(token, Claims::getExpiration).before(new Date());
		return extractAllclaims(token).getExpiration().before(new Date());
	}

	public Key getSigingKey() {
		//byte[] converted_secret_Key_bytes = Secret_Key.getBytes();
		byte[] keybytes = Decoders.BASE64.decode(Secret_Key);
		return Keys.hmacShaKeyFor(keybytes) ;
	}

}
