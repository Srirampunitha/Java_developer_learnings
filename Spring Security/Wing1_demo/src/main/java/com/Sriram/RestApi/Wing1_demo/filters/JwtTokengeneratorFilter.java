package com.Sriram.RestApi.Wing1_demo.filters;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.crypto.SecretKey;

import org.springframework.data.auditing.CurrentDateTimeProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtTokengeneratorFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		     Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		   if(null!=auth) {
			   SecretKey key = Keys.hmacShaKeyFor(SecurityContsatnts.JWT_KEY.getBytes(StandardCharsets.UTF_8));
			   String jwt = Jwts.builder().issuer("Sriram").subject("Demo for Wings1")
					   .claim("username", auth.getName())
					   .claim("authorities", populateAuthorities(auth.getAuthorities()))
					   .issuedAt(new java.util.Date())
					   .expiration(new Date((new java.util.Date()).getTime() + 30000000))
					   .signWith(key)
					   .compact();
			   response.setHeader(SecurityContsatnts.JWT_HEADER, jwt);
			   
		   }
		   
		   filterChain.doFilter(request, response);
	}

	private String populateAuthorities(Collection<? extends GrantedAuthority> authorities) {
		Set<String> authority = new HashSet<>();
		for(GrantedAuthority author:authorities) {
			authority.add(author.getAuthority());
		}
		return	String.join(",", authority);
		
	}
      
}
