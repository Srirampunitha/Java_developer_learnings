package com.Sriram.RestApi.Wing1_demo.filters;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.crypto.SecretKey;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtTokenValidator extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		     String jwt = request.getHeader(SecurityContsatnts.JWT_HEADER);
		     if(null!=jwt) {
		    	 SecretKey key = Keys.hmacShaKeyFor(SecurityContsatnts.JWT_KEY.getBytes(StandardCharsets.UTF_8));
				Claims claim = Jwts.parser()
	                           .verifyWith(key)
	                           .build()
	                            .parseSignedClaims(jwt)
	                            .getPayload();
				String username = String.valueOf(claim.get("username"));
	             String authorities = (String)claim.get("authorities"); 
	             Authentication auth = new UsernamePasswordAuthenticationToken(username, null, AuthorityUtils.commaSeparatedStringToAuthorityList(authorities));
	             SecurityContextHolder.getContext().setAuthentication(auth);
		     }else {
		    	 throw new UsernameNotFoundException("user not found");
		     }
		 filterChain.doFilter(request, response);   
	}
	

}
