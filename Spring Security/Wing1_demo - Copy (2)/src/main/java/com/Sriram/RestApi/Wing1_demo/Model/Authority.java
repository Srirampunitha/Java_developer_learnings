package com.Sriram.RestApi.Wing1_demo.Model;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="authorities")
public class Authority {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	 @GenericGenerator(name="native" ,strategy = "native")
     private int id;
     private String name;
     @JsonIgnore
     @ManyToOne
     @JoinColumn(name ="customer_id")
     private Customers customer;
	public Authority(int id, String name, Customers customer) {
		super();
		this.id = id;
		this.name = name;
		this.customer = customer;
	}
	public Authority() {
		super();
		// TODO Auto-generated constructor stub
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
	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Authority [id=" + id + ", name=" + name + ", customer=" + customer + "]";
	}
     
     
}
