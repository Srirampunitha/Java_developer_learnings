package com.Sriram.Rest.Webservices.Restfull_services.socialMediaApi;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Sriram.Rest.Webservices.Restfull_services.socialMediaApi.exceptions.UserNotFoundException;

import jakarta.validation.Valid;

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
		User user = userservice.findById(id);
		if(user== null ) {
			throw new UserNotFoundException("User ID "+id + " is Not found");
		}else {	
		return user ;
		}
		
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> CreateUsers(@Valid @RequestBody User user){
	   User users = userservice.addUsers(user);
	   URI location =ServletUriComponentsBuilder
			   .fromCurrentRequest()
			   .path("/{id}")
			   .buildAndExpand(users.getId())
			   .toUri();
	  return ResponseEntity.created(location).build();
	//return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/users/{id}")
	public void DeleteUserbyID(@PathVariable int id){
		User user = userservice.findById(id);
		if(user== null ) {
			throw new UserNotFoundException("User ID "+id + " is Not found");
		}else {	
			userservice.deleteById(id);
		}
	  
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<User> Updateuser(@PathVariable int id , @RequestBody User user){
		return userservice.Updateduser(id,user);
	}
	
}
