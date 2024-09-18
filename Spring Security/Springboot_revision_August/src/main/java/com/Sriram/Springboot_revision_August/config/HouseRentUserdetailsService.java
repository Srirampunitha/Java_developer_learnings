package com.Sriram.Springboot_revision_August.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.mapping.UserDefinedType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Sriram.Springboot_revision_August.entity.Authority;
import com.Sriram.Springboot_revision_August.entity.Boys;
import com.Sriram.Springboot_revision_August.repository.BoysRepo;


public class HouseRentUserdetailsService implements UserDetailsService  {
	
	@Autowired
	private BoysRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 String name=null;
		 String password =null;
		 List<GrantedAuthority> authorities ;
		 
		 List<Boys> boys = repo.findByUsername(username);
		 if(boys.isEmpty()) {
			 throw new UsernameNotFoundException("no user found with this username");
		 }else {
		 name = boys.get(0).getUsername();
		 password = boys.get(0).getPassword();
		 authorities= new ArrayList<>();
		 authorities.add(new SimpleGrantedAuthority(boys.get(0).getRole()));
		return new User(name, password, authorities);
		 }
	}

//	private List<GrantedAuthority> grandedauthorities(Set<Authority> authorities) {
//		 List<GrantedAuthority> au = new ArrayList<>();
//		for(Authority auth : authorities) {
//			au.add(new SimpleGrantedAuthority(auth.getName()));
//		}
//		return au;
//	}

}
