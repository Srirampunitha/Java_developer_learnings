package com.Sriram.Spring.SpringSecurityLearning.model;

import java.lang.annotation.Native;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
   
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
	private int id;
	private String email;
	private String password;
	private String role;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String email, String password, String role) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}
	
	
}
