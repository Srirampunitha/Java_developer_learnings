package com.Sriram.Restfull.Cricket.player;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.Sriram.Restfull.Cricket.player.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
     @Autowired
	public PlayerRepository repository; 
	
	public List<Player> findAllPlayers() {
		return repository.findAll();
	}

	public Player createPlayerInfo(Player player) {
		return repository.save(player) ;
	}

	public ResponseEntity<Object> deleteById(int id) {
		 Optional<Player> opPlayer= repository.findById(id);
		 if(opPlayer.isEmpty()) {
			 return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		 }else {
	    repository.deleteById(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
		 }
	}

	public ResponseEntity<Object> update(int id, Player player) {
		 Optional<Player> opPlayer= repository.findById(id);
		 if(opPlayer.isEmpty()) {
			 return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		 }else {
	        Player oldplayer  = opPlayer.get();
	        oldplayer.setName(player.getName());
	        oldplayer.setJersyno(player.getJersyno());
	        oldplayer.setAverage(player.getAverage());
	        oldplayer.setId(id);
	        repository.save(oldplayer);
		     return new ResponseEntity<Object>(HttpStatus.OK);
		 }
	}

	public ResponseEntity<Object> updateHS(int id, int highestScore) {
		Optional<Player> opPlayer= repository.findById(id);
		 if(opPlayer.isEmpty()) {
			 return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		 }else {
	        Player oldplayer  = opPlayer.get();
	        oldplayer.setHighestscore(highestScore);
	        oldplayer.setId(id);
	        repository.save(oldplayer);
		     return new ResponseEntity<Object>(HttpStatus.OK);
		 }
	}

	public ResponseEntity<Object> findByName(String name) {
		  Predicate<Player> predicate = players -> players.getName().equalsIgnoreCase(name) ;
		  List<Player> players = repository.findAll();
		List<Player> play=  players.stream().filter(predicate).toList();
		  if(!play.isEmpty()) {
			  
			  return new ResponseEntity<Object>(play,HttpStatus.OK);
		  }else {
			  return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		  }
	}

}
