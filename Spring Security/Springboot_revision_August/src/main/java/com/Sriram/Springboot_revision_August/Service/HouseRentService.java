package com.Sriram.Springboot_revision_August.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Sriram.Springboot_revision_August.entity.HouseRent;
import com.Sriram.Springboot_revision_August.repository.HouseRentRepo;

@Service
public class HouseRentService {
	
	@Autowired
	private HouseRentRepo repo;

	public Object getAllHouseRentInfo() {
	List<HouseRent> listOfHouseRentInfo =	repo.findAll();
	    if(listOfHouseRentInfo.isEmpty()) {
	    	return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	    }else {
	    	return new ResponseEntity<>(listOfHouseRentInfo,HttpStatus.OK);
	    }
		
		
	}

	public Object getRentInfoById(int id) {
		     if(repo.existsById(id)) {
		    	Optional<HouseRent> listOfHouseRentInfo  = repo.findById(id);
		    	 return new ResponseEntity<>(listOfHouseRentInfo.get() 	 	 	,HttpStatus.OK); 
		     }else {
		    	 return new ResponseEntity<>("Id Not Found",HttpStatus.NOT_FOUND);
		     }
			}

	public Object deleteByID(int id) {
		if(repo.existsById(id)) {
	    	  repo.deleteById(id);
	      List<HouseRent> listOfHouseRentInfo =	repo.findAll();
	      return new ResponseEntity<>(listOfHouseRentInfo,HttpStatus.OK); 
	     }else {
	    	 return new ResponseEntity<>("Id Not Found",HttpStatus.NOT_FOUND);
	     }

			}

	public Object updateById(HouseRent hr, int id) {
		if(repo.existsById(id)) {
	    Optional<HouseRent> hrentOp	= repo.findById(id);
	    if(hrentOp.isEmpty()) {
	    	return new ResponseEntity<>("Something bad in request",HttpStatus.BAD_REQUEST);
	    }else {
	    	   HouseRent OldHR = hrentOp.get();
	    	   OldHR.setId(id);
	    	   OldHR.setAmount(hr.getAmount());
	    	   OldHR.setName(hr.getName());
	    	   OldHR.setPaid(hr.isPaid());
	    	   OldHR.setPaidDate(hr.getPaidDate());
	    	 HouseRent newHr =   repo.save(OldHR);
		      return new ResponseEntity<>(newHr,HttpStatus.OK);
	    }
	      
	     }else {
	    	 return new ResponseEntity<>("Id Not Found",HttpStatus.NOT_FOUND);
	     }
	}

	public Object patchDate(float date , int id) {
		  
		if(repo.existsById(id)) {
		    Optional<HouseRent> hrentOp	= repo.findById(id);
		    if(hrentOp.isEmpty()) {
		    	return new ResponseEntity<>("Something bad in request",HttpStatus.BAD_REQUEST);
		    }else {
		    	   HouseRent OldHR = hrentOp.get();
		    	   OldHR.setAmount(date);
		    	   HouseRent newHr =   repo.save(OldHR);
			      return new ResponseEntity<>(newHr,HttpStatus.OK);
		    }
		      
		     }else {
		    	 return new ResponseEntity<>("Id Not Found",HttpStatus.NOT_FOUND);
		     }
	}

	public Object postHrdetails(HouseRent houserent) {
		HouseRent savedHr= repo.save(houserent);
		if(savedHr.getId()>0) {
			return new ResponseEntity<>(savedHr,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>("Something bad in request",HttpStatus.BAD_REQUEST);
		}
			}
	
	

}
