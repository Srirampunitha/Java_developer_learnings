package com.Sriram.Springboot_revision_August.entity;

import java.lang.annotation.Native;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="authority")
public class Authority {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO , generator = "Native")
	@GenericGenerator(name="Native",strategy = "native")
    private int id;
    private String name;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "boys_id")
    private Boys boys;
    
    
	public Authority() {
		super();
		
	}
	
	public Authority(int id, String name, Boys boys) {
		super();
		this.id = id;
		this.name = name;
		this.boys = boys;
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
	public Boys getBoys() {
		return boys;
	}
	public void setBoys(Boys boys) {
		this.boys = boys;
	}
	@Override
	public String toString() {
		return "Authority [id=" + id + ", name=" + name + ", boys=" + boys + "]";
	}
    
}
