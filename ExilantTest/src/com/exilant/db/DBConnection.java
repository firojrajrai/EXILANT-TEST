package com.exilant.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
static String url="jdbc:mysql://localhost:3306/mydb";
static String userName = "root";
static String password="root123";
static Connection con;
static {
	try {
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection(url, userName, password);
	System.out.println("CONNECTION ESTABLISHED");
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("ERROR in DB CONNECTION");
	}
}

public static Connection getConnection() {
	return con;
}
}
