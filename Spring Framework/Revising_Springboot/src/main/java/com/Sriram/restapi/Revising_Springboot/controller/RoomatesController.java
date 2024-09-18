package com.Sriram.restapi.Revising_Springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Sriram.restapi.Revising_Springboot.entity.Roomates;
import com.Sriram.restapi.Revising_Springboot.service.RoomatesService;

@Controller
public class RoomatesController {
	
	@Autowired
    private RoomatesService service ;
    
	@GetMapping("/roomates")
	public Object getAllRoomates() {
		return service.getRoomates();
	}
	
	@PostMapping("/roomates")
	public Object addRoomates(@RequestBody Roomates roomies) {
		return service.addRooomies(roomies);
	}
	
	@DeleteMapping("/roomates/{id}")
    public Object deleteRoomates(@PathVariable int id) {
		return service.deleteRoomies(id);
	}
	
	@PutMapping("/roomates/{id}")
	public Object updateRoomates(@RequestBody Roomates roomies , @PathVariable int id) {
	  return service.updateRoomies(roomies,id);	
	}
	
}
