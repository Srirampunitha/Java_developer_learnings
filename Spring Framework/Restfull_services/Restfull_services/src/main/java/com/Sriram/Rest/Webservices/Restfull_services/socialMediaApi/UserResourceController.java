package com.Sriram.Rest.Webservices.Restfull_services.socialMediaApi;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResourceController {
	 
	 @Autowired
     private UserDaoService userservice ;
	
	
	@GetMapping("/users")
	public List<User> findallUsers(){
		return userservice.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User findUsersbyID(@PathVariable int id){
		return userservice.findById(id);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> CreateUsers(@RequestBody User user){
	   User users = userservice.addUsers(user);
	   URI location =ServletUriComponentsBuilder
			   .fromCurrentRequest()
			   .path("/{id}")
			   .buildAndExpand(users.getId())
			   .toUri();
	  return ResponseEntity.created(location).build();
	//return new ResponseEntity<>(HttpStatus.OK);
	}
}
