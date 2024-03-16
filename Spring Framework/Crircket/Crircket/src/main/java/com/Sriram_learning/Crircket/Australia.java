package com.Sriram_learning.Crircket;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Australia implements CricketPlayerInfo {
	private Player2 player;
	public Australia (Player2 player) {
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
