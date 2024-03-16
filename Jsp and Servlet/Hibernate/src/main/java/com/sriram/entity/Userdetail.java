package com.sriram.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name= "userdetails")
@Table(name="userdetails")
public class Userdetail {
    @Id
    @Column(name ="ID")
	int ID ;
    @Column(name ="Name")
	String Name;
    @Column(name ="Email")
	String Email;
    
    
    
	public Userdetail(String name, String email) {
		super();
		Name = name;
		Email = email;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
    
}
