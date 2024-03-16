package com.Sriram_learning.Crircket;

import org.springframework.stereotype.Component;

@Component
public class India implements CricketPlayerInfo{

	private Player1 player;
	public India (Player1 player) {
		this.player = player ;
	}
    public String name() {
    	return player.name;
	}
	public int highestscore() {
		
		return player.highestscore;
	}
	public float average() {
		
		return player.average;
	}
	public String playerstayle() {
		
		return player.playerstayle;
	}
	
	public String country() {
		return player.country;
	}

}
