package com.assignment.jdbc.ques1.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionConfig {
	private static String url = "jdbc:mysql://localhost:3306/ques1";
	private static String username = "root";
	private static String password = "root";
	
	public static Connection connect() throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return DriverManager.getConnection(url, username, password);
	}
}
