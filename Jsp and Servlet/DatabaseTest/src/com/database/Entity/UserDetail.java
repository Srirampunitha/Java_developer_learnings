package com.database.Entity;

public class UserDetail {
   private int ID ;
   private String Name ;
   private String Email ;
public UserDetail(int iD, String name, String email) {
	super();
	ID = iD;
	Name = name;
	Email = email;
}


public UserDetail(String name, String email) {
	super();
	Name = name;
	Email = email;
}


public UserDetail(int iD) {
	super();
	ID = iD;
}


public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
   
   
}
