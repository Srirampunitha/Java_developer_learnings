package com.database.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
public static Connection getdataconnection () {
	Connection con = null ;
	
	String dbURl = "jdbc:mysql://localhost:3306/userdata";
	String dbuser = "root";
	String dbPassword = "Sri542@ap";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbURl, dbuser, dbPassword);		
		System.out.println("connection established");
	    } 
	     catch (SQLException e) {
	    	 System.out.println("connection not established");
			e.printStackTrace();
		}
	     catch (ClassNotFoundException e) {
	    	 System.out.println("connection not class not found established");
		e.printStackTrace();
	    }
	
	return con ;
}
}
