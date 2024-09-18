package com.Sriram.restapi.Revising_Springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Sriram.restapi.Revising_Springboot.entity.Roomates;

@Service
public class RoomatesService {
       @Autowired
	private RoomatesRepository repo;
	
	public Object getRoomates() {
	    List<Roomates> roomies = repo.findAll();
	    if(roomies.isEmpty()) {
	    	return new ResponseEntity<>("noo roomies found",HttpStatus.BAD_REQUEST);
	    	}else {
	    		return new ResponseEntity<>(roomies,HttpStatus.OK);
	    	}
	}

	public Object addRooomies(Roomates roomies) {
		
		Roomates roomie = repo.save(roomies);
		
		if(roomie!=null) {
			return new ResponseEntity<>(roomie,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>("noo roomies Added",HttpStatus.BAD_REQUEST);
		}
	}

	public Object deleteRoomies(int id) {
	     if(repo.existsById(id)) {
	    	 repo.deleteById(id);
	    	 return new ResponseEntity<>("roomies deleted successfully",HttpStatus.OK);
	     }else {
		return new ResponseEntity<>("roomie not found for the id: " +id,HttpStatus.NOT_FOUND);
	     }
	}

	public Object updateRoomies(Roomates roomies, int id) {
		if(repo.existsById(id)) {
		Optional<Roomates> oldRoomi = repo.findById(id);
		 if(oldRoomi.isEmpty()) {
			 return new ResponseEntity<>("roomie empty" ,HttpStatus.NO_CONTENT);
		 }else {
			 Roomates roomie = oldRoomi.get();
			 roomie.setId(id);
			 roomie.setAge(roomies.getAge());
			 roomie.setCompany(roomies.getCompany());
			 roomie.setName(roomies.getName());
			 Roomates Savedroomie = repo.save(roomie);
			 return new ResponseEntity<>(Savedroomie,HttpStatus.OK);
		 }
		}else {
			return new ResponseEntity<>("roomie not found for the id: " +id,HttpStatus.NOT_FOUND);	
		}
		
	}

}
