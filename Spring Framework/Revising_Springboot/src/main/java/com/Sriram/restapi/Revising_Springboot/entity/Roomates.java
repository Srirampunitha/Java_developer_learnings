package com.Sriram.restapi.Revising_Springboot.entity;

import java.lang.annotation.Native;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Roomates {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Integer id ;
	private String name;
	private int age;
	private String company;
	public Roomates(Integer id, String name, int age, String company) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.company = company;
	}
	public Roomates() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Roomates [id=" + id + ", name=" + name + ", age=" + age + ", company=" + company + "]";
	}
	
	
}
