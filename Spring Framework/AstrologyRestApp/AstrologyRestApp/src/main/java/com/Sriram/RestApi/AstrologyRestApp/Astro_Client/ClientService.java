package com.Sriram.RestApi.AstrologyRestApp.Astro_Client;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	
	@Autowired
    private ClientRepository repo ;
	
	public List<ClientDetail> findAllClient(){
		return repo.findAll();	
	}
	
	public ClientDetail addClient(ClientDetail detail) {
		return repo.save(detail);
	}
	
	public ResponseEntity<Object> findById(int id) {
		Optional<ClientDetail> optionalclient =repo.findById(id); 
		if(optionalclient.isEmpty()) {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<Object>(optionalclient.get(),HttpStatus.OK);
		}		
  }
	public ResponseEntity<Object> deleteById(int id) {
		Optional<ClientDetail> optionalclient =repo.findById(id); 
		if(optionalclient.isEmpty()) {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
		else {
			repo.deleteById(id);
			return new ResponseEntity<Object>(HttpStatus.OK);
		}
     }
	
	public ResponseEntity<Object> updateClientDetails(int id , ClientDetail newdetail) {
		Optional<ClientDetail> optionalclient =repo.findById(id); 
		if(optionalclient.isEmpty()) {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
		else {
			  ClientDetail olddetail = optionalclient.get();
			  olddetail.setAdvanceAmount(newdetail.getAdvanceAmount());
			  olddetail.setBalanceAmount(newdetail.getBalanceAmount());
			  olddetail.setBirth_date_time(newdetail.getBirth_date_time());
			  olddetail.setId(id);
			  olddetail.setClientname(newdetail.getClientname());
			  repo.save(olddetail);
			return new ResponseEntity<Object>(optionalclient.get(),HttpStatus.OK);
		}		
  }
}
