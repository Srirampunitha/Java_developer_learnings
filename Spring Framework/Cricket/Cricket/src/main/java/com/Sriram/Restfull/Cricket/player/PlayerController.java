package com.Sriram.Restfull.Cricket.player;

import java.net.http.HttpRequest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class PlayerController{
	@Autowired
	private PlayerService service ;
	
	@GetMapping("players/info")
   public ResponseEntity<Object> playersInfo(){
	List<Player> players = service.findAllPlayers();
	if(players.isEmpty()) {
		return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
	}else {
	    return new ResponseEntity<Object>(players ,HttpStatus.OK);
	    }
	}
	@PostMapping("players/info")
   public ResponseEntity<Object> createPlayerInfo(@RequestBody Player player){
		Player playerinfo = service.createPlayerInfo(player);
		if(playerinfo!=null) {
	   return new ResponseEntity<Object>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	    }
	@DeleteMapping("players/info/{id}")
   public ResponseEntity<Object> deletePlayerInfo(@PathVariable int id){
	   return service.deleteById(id);
	    }
	@PutMapping("players/info/{id}")
   public ResponseEntity<Object> UpdatePlayerInfo(@PathVariable int id , @RequestBody Player player){
		
	   return service.update(id,player);
	    }
	
	@PatchMapping("players/info/{id}/updateHS/{highestScore}")
   public ResponseEntity<Object> updateHigestScore(@PathVariable int id , @PathVariable Integer highestScore){
	   return service.updateHS(id,highestScore);
	    }
	 @GetMapping("players/info/{name}")
   public ResponseEntity<Object> FindbyName(@PathVariable String name){
	   return service.findByName(name);
   }
	 @GetMapping("players/info/CSRF-TOKEN")
	   public CsrfToken findcsrfToken(HttpServletRequest request){
		 return (CsrfToken) request.getAttribute("_csrf");
	   }

}
