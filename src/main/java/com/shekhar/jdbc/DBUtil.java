package com.shekhar.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBUtil {
	
	private static final String URL = "jdbc:mysql://localhost:3306/users";
	private static final String USER = "root";
	private static final String PASSWORD = "@Admin1431";
	
	private static Connection connection;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException ee) {
			System.out.println("No My-SQL Driver Found");
			ee.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			
		}catch(SQLException sq) {
			sq.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection() {
		
		try {
			if(connection!=null && !connection.isClosed()) {
				connection.close();
			}
		}catch (Exception e) {
			System.out.println("Connection may be already closed");
			e.printStackTrace();
			
		}
	}
	
	
	

}
