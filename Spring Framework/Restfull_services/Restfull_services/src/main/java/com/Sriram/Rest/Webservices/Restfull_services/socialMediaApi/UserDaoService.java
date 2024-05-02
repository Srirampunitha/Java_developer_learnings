package com.Sriram.Rest.Webservices.Restfull_services.socialMediaApi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserDaoService {
	@Autowired
      private UserRepository repo ;
    public List<User> findAll(){
    	return repo.findAll() ;
    }
    
    public User findById(int id) {
//    	Predicate<User> predicate = user->user.getId()==id ;
//    	return users.stream().filter(predicate).findFirst().orElse(null);
    	Optional<User> user =repo.findById(id);
    	return user.get();
    }
    public void deleteById(int id) {
//    	Predicate<User> predicate = user->user.getId()==id ;
//    	users.removeIf(predicate);
    	repo.deleteById(id);
    }
    public User addUsers(User user) {
    	return repo.save(user);
    }

	public ResponseEntity<User> Updateduser(int id ,User user) {
		Optional<User> optionaluser  = repo.findById(id);
		if(optionaluser.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}else
		{
			User updateduser = optionaluser.get();
			updateduser.setName(user.getName());
			updateduser.setBirthdate(user.getBirthdate());
			updateduser.setId(id);
			repo.save(updateduser);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}
}
