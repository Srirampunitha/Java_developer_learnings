package com.database.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.database.Entity.UserDetail;
import com.database.config.DatabaseConfig;

public class UserDetailModel {
	
public static List<UserDetail> listOfUsers(){

	List<UserDetail> list = new ArrayList<>();
	
	
	Statement stmt = null ;
	ResultSet rs = null;
	//1.connecting database
	Connection connect = DatabaseConfig.getdataconnection();
	
	//2.creating query
	String query = "SELECT * FROM userdata.userdetails";
	try {
		stmt = connect.createStatement();
		
		//3.Executing query
		rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			list.add(new UserDetail(rs.getInt("ID"), rs.getString("Name"), rs.getString("Email")));
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return list;
}

public static void adduser(UserDetail adduser) {
	String username = adduser.getName();
	String email = adduser.getEmail();
	PreparedStatement stmt = null ;
	String query = 
	"INSERT INTO `userdata`.`userdetails` ( `Name`, `Email`) VALUES (?, ?)";
    Connection con = DatabaseConfig.getdataconnection();
    try {
		stmt = con.prepareStatement(query);
		stmt.setString(1, username);
		stmt.setString(2, email);
		stmt.execute();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}   
}

public static void updateuser(UserDetail updateuser) {
	String username = updateuser.getName();
	String email = updateuser.getEmail();
	int id = updateuser.getID();
	PreparedStatement stmt = null ;
	String query = 
	"UPDATE `userdata`.`userdetails` SET Name = ?, Email = ? WHERE ID =?";
    Connection con = DatabaseConfig.getdataconnection();
    try {
		stmt = con.prepareStatement(query);
		stmt.setInt(3, id);
		stmt.setString(1, username);
		stmt.setString(2, email);
		stmt.execute();
	} catch (SQLException e) {
		System.out.println("not able to update data in DB");
		e.printStackTrace();
	}   
}

public static void deleteuser(UserDetail deleteuser) {
	int id = deleteuser.getID();
	PreparedStatement stmt = null ;
	String query = 
	"DELETE FROM `userdata`.`userdetails` WHERE (`ID` = ?)";
    Connection con = DatabaseConfig.getdataconnection();
    try {
		stmt = con.prepareStatement(query);
		stmt.setInt(1, id);
		stmt.execute();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}   
}
public static void main(String[] args) {

	}

}
