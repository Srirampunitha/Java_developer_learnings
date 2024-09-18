package com.Sriram.Springboot_revision_August.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="houserent")
public class HouseRent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int id ;
    public String name;
    public boolean paid;
    public float amount;
    public Date paidDate;
    
    
	public HouseRent() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	public HouseRent(int id, String name, boolean paid, float amount, Date paidDate) {
		super();
		this.id = id;
		this.name = name;
		this.paid = paid;
		this.amount = amount;
		this.paidDate = paidDate;
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

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	@Override
	public String toString() {
		return "HouseRent [id=" + id + ", name=" + name + ", paid=" + paid + ", amount=" + amount + ", paidDate="
				+ paidDate + "]";
	}
    
    
}
