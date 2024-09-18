package com.Sriram.Springboot_revision_August.entity;

import java.util.Set;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="boys")
public class Boys {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO , generator = "Native")
	@GenericGenerator(name="Native",strategy = "native")
	@Column(name="boys_id")
	private int id;
	private String username;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	private String role;
	@OneToMany(mappedBy = "boys",fetch = FetchType.EAGER)
	private Set<Authority> authorities;
		
	
	
	
	public Boys(int id, String username, String password, String role, Set<Authority> authorities) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.authorities = authorities;
	}


	public Boys() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
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


	public Set<Authority> getAuthorities() {
		return authorities;
	}


	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}


	@Override
	public String toString() {
		return "Boys [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", authorities=" + authorities + "]";
	}


	
	
}
