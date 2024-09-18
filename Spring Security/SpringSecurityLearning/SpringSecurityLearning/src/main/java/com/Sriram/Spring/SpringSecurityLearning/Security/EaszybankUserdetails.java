package com.Sriram.Spring.SpringSecurityLearning.Security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Sriram.Spring.SpringSecurityLearning.model.Customer;
import com.Sriram.Spring.SpringSecurityLearning.repository.CustomerRepoitory;

@Service
public class EaszybankUserdetails implements UserDetailsService {
	   
	  @Autowired
      private CustomerRepoitory repo ;
	
	  @Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		  System.out.println("entered loadbyusername method");
		 String Username,password =null;
		 List<GrantedAuthority> authorities = null;
		 
		 List<Customer> customer = repo.findByEmail(username);
		 if(customer.isEmpty()) {
			 throw new UsernameNotFoundException("Username is not found"+username);
		 }else {
			 Username = customer.get(0).getEmail();
			 password = customer.get(0).getPassword();
			 authorities = new ArrayList<>();
			 authorities.add(new SimpleGrantedAuthority(customer.get(0).getRole()));
			 return new User(Username, password, authorities);
		 }
		
	}
      
}
