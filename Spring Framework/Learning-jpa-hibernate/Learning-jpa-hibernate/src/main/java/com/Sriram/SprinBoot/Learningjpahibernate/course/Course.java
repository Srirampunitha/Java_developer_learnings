package com.Sriram.SprinBoot.Learningjpahibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	@Column
	private int id ;
	@Column
	private String name;
	@Column
	private String author;
	
	public Course () {
		
	}
	
	public Course(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	

	public Course( String name, String author,int id) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	
	public Course(int id) {
		super();
		this.id = id;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}