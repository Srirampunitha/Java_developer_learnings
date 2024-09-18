package com.Sriram.RestApi.Wing1_demo.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Sriram.RestApi.Wing1_demo.Model.Authority;
import com.Sriram.RestApi.Wing1_demo.Model.Customers;
import com.Sriram.RestApi.Wing1_demo.repository.CustomersRepository;

@Service
public class CustomerAuthenticationProvider implements AuthenticationProvider{
     @Autowired  
	private PasswordEncoder passwordencoder;
     @Autowired
     private CustomersRepository repo;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		String password =authentication.getCredentials().toString();
		List<Customers> customers = repo.findByUsername(username);
		if(customers.size()>0) {
			if(passwordencoder.matches(password, customers.get(0).getPassword())) {
				return new UsernamePasswordAuthenticationToken(username, password, grandedAuthorities(customers.get(0).getAuthorities()));
			}else {
				throw new BadCredentialsException("password not match");
			}
		}else {
			throw new UsernameNotFoundException("username notfound"+username);
		}
		
	}

	private Collection<? extends GrantedAuthority> grandedAuthorities(Set<Authority> authorities) {
	       List<GrantedAuthority> grandedauthority = new ArrayList<>();
		for(Authority authority : authorities) {
			grandedauthority.add(new SimpleGrantedAuthority(authority.getName()));
	  }
		return grandedauthority;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
