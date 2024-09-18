package com.Sriram.Springboot_revision_August.config;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Sriram.Springboot_revision_August.entity.Authority;
import com.Sriram.Springboot_revision_August.entity.Boys;
import com.Sriram.Springboot_revision_August.repository.BoysRepo;

@Service
public class houseRentAuthenticationProvider implements AuthenticationProvider  {
      @Autowired
	  private BoysRepo repo;  
      @Autowired
      private PasswordEncoder passwordencoder;
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username  = authentication.getName();
		String password = authentication.getCredentials().toString();
		List<Boys> boys = repo.findByUsername(username);
		if(!boys.isEmpty()) {
			if(passwordencoder.matches(password, boys.get(0).getPassword())) {
				return new UsernamePasswordAuthenticationToken(username, password, grantedAuthorities(boys.get(0).getRole()));
			}else {
				throw new BadCredentialsException("password not Match");
			}
		}else {
			throw new UsernameNotFoundException("No user found for this username");
		}
	}

	private Collection<? extends GrantedAuthority> grantedAuthorities(String string) {
		List<GrantedAuthority> list = new ArrayList<>();
//		for(Authority authorities : string) {
//			list.add(new SimpleGrantedAuthority(authorities.getName()));
//		}
		list.add(new SimpleGrantedAuthority(string));
		return list;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);

	}

}
