package com.Sriram.Springboot_revision_August.contoller;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.Sriram.Springboot_revision_August.Service.HouseRentService;
import com.Sriram.Springboot_revision_August.entity.HouseRent;

@RestController
public class HouseRentController {
	
	@Autowired
	private HouseRentService service ;
	
	@PostMapping("/houseRentInfo")
	public Object addHouserentdetails(@RequestBody HouseRent houserent) {
		return service.postHrdetails(houserent);
	}
	 @GetMapping("/houseRentInfo")
	public Object getAllHouserentInfo() {
		return service.getAllHouseRentInfo();
	} 
	@GetMapping("/houseRentInfoAdmin/{id}")
	public Object getHouseinfoById(@PathVariable int id) {
		return service.getRentInfoById(id);
	}
	   @DeleteMapping("/houseRentInfoAdmin/{id}")
	public Object dleteByID(@PathVariable int id) {
		return service.deleteByID(id);
	}
	   @PutMapping("/houseRentInfoAdmin/{id}")
	public Object UpdateByID(@RequestBody HouseRent hr , @PathVariable int id) {
		return service.updateById(hr,id);
		
	}
	@PatchMapping("/houseRentInfoAdmin/{id}/editamt")
	public Object patchDateById(@RequestParam float date, @PathVariable int id) {
		return service.patchDate(date,id);
	}
	
	
}
