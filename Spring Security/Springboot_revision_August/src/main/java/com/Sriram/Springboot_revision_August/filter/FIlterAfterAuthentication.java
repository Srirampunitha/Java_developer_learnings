package com.Sriram.Springboot_revision_August.filter;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FIlterAfterAuthentication implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	Authentication auth = 	SecurityContextHolder.getContext().getAuthentication();
		 String name=auth.getName();
		 String role = auth.getAuthorities().toString();
		 System.out.println("the username "+name+"has authentication sucessfully and has following roles "+role);
	     chain.doFilter(request, response);
	}

}
