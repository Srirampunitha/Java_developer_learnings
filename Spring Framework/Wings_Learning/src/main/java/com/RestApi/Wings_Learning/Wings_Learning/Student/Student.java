package com.RestApi.Wings_Learning.Wings_Learning.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
     
	@Id
	@GeneratedValue
	private long id;
    private String name;
    private String place;
	
    
    public Student(long id, String name, String place) {
		this.id = id;
		this.name = name;
		this.place = place;
	}


	public Student() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
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


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", place=" + place + "]";
	}
    
    
    
    
}
