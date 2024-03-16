package com.Sriram.AstrologyApp.client;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="clientinfo")
public class ClientInfo {
    @Id
    @Column
	private int id ;
    @Column
    private String name;
    @Column
    private String place;
    @Column
    private String phoneno ;
    
    
    
	public ClientInfo(int id, String name, String place, String phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.phoneno = phoneno;
	}
	
	public ClientInfo() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "ClientInfo [id=" + id + ", name=" + name + ", place=" + place + ", phoneno=" + phoneno + "]";
	}
	
    
}
