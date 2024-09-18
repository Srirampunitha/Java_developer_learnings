package com.Sriram.Jwt_Token_Authentication.auth;
	import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.Lazy;
	import org.springframework.security.authentication.AuthenticationManager;
	import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
	import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
	import org.springframework.stereotype.Service;

	import com.Sriram.Jwt_Token_Authentication.auth.AuthenticationResponse;
	import com.Sriram.Jwt_Token_Authentication.auth.LoginRequest;

	import com.Sriram.Jwt_Token_Authentication.model.Customer;
	import com.Sriram.Jwt_Token_Authentication.model.Role;
	import com.Sriram.Jwt_Token_Authentication.model.config.jwtservice;
	import com.Sriram.Jwt_Token_Authentication.repo.CustomerRepo;

	import lombok.Builder;
import lombok.RequiredArgsConstructor;

	@Service
	@RequiredArgsConstructor
	public class AuthenticateService {
	     
		private final PasswordEncoder passwordencoder;
		private final jwtservice jwtservice;
		private final CustomerRepo repo;
	    private final AuthenticationManager authmanager;
		
		public AuthenticationResponse registerUser(RegisterRequest request) {
		     var user = Customer.builder()
		    		 .firstName(request.getFirstname())
		    		 .lastName(request.getLastname())
		    		 .mail(request.getEmail())
		    		 .pasword(passwordencoder.encode(request.getPassword()))
		    		 .role(Role.Admin)
		    		 .build();
			
			 
			repo.save(user);
			String token = jwtservice.generateToken(user);
					
			return AuthenticationResponse.builder().token(token).build();
		}

		public AuthenticationResponse loginUser(LoginRequest request) {
		     authmanager.authenticate
		     (new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
		     var user = repo.findByMail(request.getEmail()).orElseThrow(()-> new UsernameNotFoundException("user not found"));
		     HashMap<String, Object> secret_hash = new HashMap<>();
		     secret_hash.put("Secret_Msg", new String("Kuruvi"));
		     String token = jwtservice.generateToken(secret_hash,user);
				
		     return AuthenticationResponse.builder().token(token).build();
		}
	    
	}


