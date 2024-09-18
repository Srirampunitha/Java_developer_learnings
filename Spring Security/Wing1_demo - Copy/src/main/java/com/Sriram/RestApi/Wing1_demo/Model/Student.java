package com.Sriram.RestApi.Wing1_demo.Model;

import java.util.List;

import jakarta.persistence.Column;
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
@Table(name = "students")
public class Student {
     
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="studnet_id")
	private int id ;
	private String name;
	private int age ;
	private String grade;
	
	@OneToOne(mappedBy = "student" , fetch = FetchType.EAGER)
	private Marks mark;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age, String grade, Marks mark) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.mark = mark;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Marks getMark() {
		return mark;
	}

	public void setMark(Marks mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", grade=" + grade + ", mark=" + mark + "]";
	}
	
}
