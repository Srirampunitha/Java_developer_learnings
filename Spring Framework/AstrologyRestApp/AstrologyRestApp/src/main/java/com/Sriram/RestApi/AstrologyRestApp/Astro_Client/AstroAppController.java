package com.Sriram.RestApi.AstrologyRestApp.Astro_Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AstroAppController {
	@Autowired
	private ClientService service ;
    
	@GetMapping("/astro/clients")
	public ResponseEntity<Object> retrieveAllClientDetails(){
		List<ClientDetail> detaillist = service.findAllClient();
		if(detaillist.isEmpty()) {
			 return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Object>(detaillist,HttpStatus.OK);
	}
	@GetMapping("/astro/clients/{id}")
	public ResponseEntity<Object> findById(@PathVariable int id){
	
		return service.findById(id);
	}
	
	@PostMapping("/astro/clients")
	public ResponseEntity<Object> addClientDetails(@RequestBody ClientDetail details){
		ClientDetail detail = service.addClient(details);
		if(detail!=null) {
		return new ResponseEntity<Object>(HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/astro/clients/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable int id){
		return service.deleteById(id);
	}
	
	@PutMapping("/astro/clients/{id}")
	public ResponseEntity<Object> updateClientDetails(@RequestBody ClientDetail details , @PathVariable int id){
		return service.updateClientDetails(id, details);
	}
}
