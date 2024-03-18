package com.voya.doctorapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DoctorDb {

	 // Database connection parameters
   
	static Connection connection;
	public static Connection openConnection() {
	    try {
	    	
	    	Class.forName("com.mysql.jdbc.Driver");
	    	
	    }catch (ClassNotFoundException e1) {
	      System.out.println("Failed to connect to the database");
	      e1.printStackTrace();
	       
	  }
	     String URL = "jdbc:mysql://localhost:3306/doctorapplication";
	     String USERNAME = "root";
	    String PASSWORD = "root";
	    
	    try {
	    	  connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
		return connection;
	    
	}
}
    // Method to open a database connection
//    public static Connection openConnection() {
//        try {
//
//        	Class.forName("com.mysql.cj.jdbc.Driver");
//            // Create the connection
//            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            System.out.println("Connected to database");
//            return connection;
//        } catch (SQLException e) {
//            System.out.println("Failed to connect to the database");
//            e.printStackTrace();
//            return null; 
//        }
//    }
//}
