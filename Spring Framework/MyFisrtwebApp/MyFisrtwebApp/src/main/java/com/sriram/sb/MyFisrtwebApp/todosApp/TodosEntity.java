package com.sriram.sb.MyFisrtwebApp.todosApp;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class TodosEntity {
   private int id ;
   private String username;
   @Size(min=5 , message = "Enter atleast 5 characters")
   private String todos ;
   private LocalDate date ;
   private boolean done ;
public TodosEntity(int id, String username, String todos, LocalDate date, boolean done) {
	super();
	this.id = id;
	this.username = username;
	this.todos = todos;
	this.date = date;
	this.done = done;
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
public String getTodos() {
	return todos;
}
public void setTodos(String todos) {
	this.todos = todos;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public boolean isDone() {
	return done;
}
public void setDone(boolean done) {
	this.done = done;
}
@Override
public String toString() {
	return "TodosEntity [id=" + id + ", username=" + username + ", todos=" + todos + ", date=" + date + ", done=" + done
			+ "]";
}
   
   
   
}
