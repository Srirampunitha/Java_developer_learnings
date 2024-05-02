package com.Sriram.RestApi.AstrologyRestApp.Astro_Client;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name="clientdetail")
public class ClientDetail {
	
	 @Id
	 @GeneratedValue
     private int id ;
     private LocalDateTime birth_date_time;
     private String place;
     @Column(name="advanceamount")
     private int advanceAmount;
     @Column(name="balanceamount")
     private int balanceAmount;
     @Column(name="namesofclient")
     private String  clientName ;
     private String fathername;
     private String mothername;
	
     
     public ClientDetail() {
		
	}
	public ClientDetail(int id, LocalDateTime birth_date_time, String place, int advanceAmount, int balanceAmount,
			String clientname, String fathername, String mothername) {
		super();
		this.id = id;
		this.birth_date_time = birth_date_time;
		this.place = place;
		this.advanceAmount = advanceAmount;
		this.balanceAmount = balanceAmount;
		this.clientName = clientname;
		this.fathername = fathername;
		this.mothername = mothername;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getBirth_date_time() {
		return birth_date_time;
	}
	public void setBirth_date_time(LocalDateTime birth_date_time) {
		this.birth_date_time = birth_date_time;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getAdvanceAmount() {
		return advanceAmount;
	}
	public void setAdvanceAmount(int advanceAmount) {
		this.advanceAmount = advanceAmount;
	}
	public int getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public String getClientname() {
		return clientName;
	}
	public void setClientname(String clientname) {
		this.clientName = clientname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	@Override
	public String toString() {
		return "ClientDetail [id=" + id + ", birth_date_time=" + birth_date_time + ", place=" + place
				+ ", advanceAmount=" + advanceAmount + ", balanceAmount=" + balanceAmount + ", clientname=" + clientName
				+ ", fathername=" + fathername + ", mothername=" + mothername + "]";
	}
	
}
