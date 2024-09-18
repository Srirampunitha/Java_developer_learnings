package com.Sriram.Jwt_Token_Authentication.model.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;


@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {
	
	
	
	private final jwtservice jwtservice;
	private final UserDetailsService userdetailsservice;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		final String authHeader = request.getHeader("Authorization");
		System.out.println("*******authheader : "+authHeader);
		final String jwt;
		final String userMail;
		if(authHeader==null && !authHeader.startsWith("Bearer ")) {
			filterChain.doFilter(request, response);
			return;
		}
		jwt = authHeader.substring(7);
		System.out.println("***************jwtToken: "+jwt);
		userMail  =jwtservice.extractUsername(jwt);
		System.out.println("********************userMail from Jwt token :"+userMail);
		if(userMail!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			UserDetails userdetails = this.userdetailsservice.loadUserByUsername(userMail);
		    if(jwtservice.isvalidToken(jwt, userdetails)) {
		    	UsernamePasswordAuthenticationToken authtoken =
		    			new UsernamePasswordAuthenticationToken(userdetails, null,userdetails.getAuthorities());
		    	   authtoken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
		    	   SecurityContextHolder.getContext().setAuthentication(authtoken);
		    }
		}
		
		
		filterChain.doFilter(request, response);
	}
	
	@Override
	protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
		  return request.getServletPath().equals("/register")||request.getServletPath().equals("/login");
		//return request.getServletContext().equals("/register")||request.getServletContext().equals("/login");
	}

}
