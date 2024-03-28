package com.Sriram.Rest.Webservices.Restfull_services.socialMediaApi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
   private static int usercount;
  public static  List<User> users = new ArrayList<>();
        static {
        	users.add(new User(++usercount,"Sriram",LocalDate.now().minusYears(24)));
        	users.add(new User(++usercount,"Aarthi",LocalDate.now().minusYears(30)));
        	users.add(new User(++usercount,"punitha",LocalDate.now().minusYears(22)));
        }  
    public List<User> findAll(){
    	return users ;
    }
    
    public User findById(int id) {
    	Predicate<User> predicate = user->user.getId()==id ;
    	
    	return users.stream().filter(predicate).findFirst().get();
    }
    public User addUsers(User user) {
    	user.setId(++usercount);
    	users.add(user);
    	return user ;
    }
}
