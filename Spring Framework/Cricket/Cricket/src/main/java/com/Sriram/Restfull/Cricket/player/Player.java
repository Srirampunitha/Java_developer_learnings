package com.Sriram.Restfull.Cricket.player;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Player {
	
	@Id
	@GeneratedValue
	 private int id ;
     private int jersyno ;
     private String name;
     private String battingstyle;
     private int highestscore;
     private float average;
	
     
     
     public Player() {
	}
	public Player(int id, int jersyno, String name, String battingstyle, int highestscore, float average) {
		super();
		this.id = id;
		this.jersyno = jersyno;
		this.name = name;
		this.battingstyle = battingstyle;
		this.highestscore = highestscore;
		this.average = average;
	}
	public int getId() {
		return id;
	}
	public int getJersyno() {
		return jersyno;
	}
	public String getName() {
		return name;
	}
	public String getBattingstyle() {
		return battingstyle;
	}
	public int getHighestscore() {
		return highestscore;
	}
	public float getAverage() {
		return average;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setJersyno(int jersyno) {
		this.jersyno = jersyno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBattingstyle(String battingstyle) {
		this.battingstyle = battingstyle;
	}
	public void setHighestscore(int highestscore) {
		this.highestscore = highestscore;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", jersyno=" + jersyno + ", name=" + name + ", battingstyle=" + battingstyle
				+ ", highestscore=" + highestscore + ", average=" + average + "]";
	}    
     
}
