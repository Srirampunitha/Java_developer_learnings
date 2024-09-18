package com.Sriram.RestApi.Wing1_demo.Model;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="marks")
public class Marks {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO ,generator = "native")
	@GenericGenerator(strategy = "native", name = "native")
	
   private int id;
   private int tamil;
   private int english;
   private int maths;
   private int social;
   private int science;
   @JsonIgnore
   @OneToOne
   @JoinColumn(name="student_id")
   private Student student;
public Marks(int id, int tamil, int english, int maths, int social, int science, Student student) {
	super();
	this.id = id;
	this.tamil = tamil;
	this.english = english;
	this.maths = maths;
	this.social = social;
	this.science = science;
	this.student = student;
}
public Marks() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTamil() {
	return tamil;
}
public void setTamil(int tamil) {
	this.tamil = tamil;
}
public int getEnglish() {
	return english;
}
public void setEnglish(int english) {
	this.english = english;
}
public int getMaths() {
	return maths;
}
public void setMaths(int maths) {
	this.maths = maths;
}
public int getSocial() {
	return social;
}
public void setSocial(int social) {
	this.social = social;
}
public int getScience() {
	return science;
}
public void setScience(int science) {
	this.science = science;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
@Override
public String toString() {
	return "Marks [id=" + id + ", tamil=" + tamil + ", english=" + english + ", maths=" + maths + ", social=" + social
			+ ", science=" + science + ", student=" + student + "]";
}
   
}
