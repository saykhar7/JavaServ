package com.shekhar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.shekhar.jdbc.DBUtil;

public class UserDaoImpl implements UserDao{
	
	
	Connection connection;

	@Override
	public boolean isValidUser(String email, String password) {
		
		
		
		return false;
	}

	@Override
	public boolean registerNewUser(String firstName, String lastName, String email, String password) {
	
		connection = DBUtil.getConnection();
		
		String insertQuery = "insert into users(firstName, lastName, email, password) values(?,?,?,?)";
		
		try {
		PreparedStatement ps = connection.prepareStatement(insertQuery);
		ps.setString(1, firstName);
		ps.setString(2,  lastName);
		ps.setString(3, email);
		ps.setString(4, password);
		
		
		int log = ps.executeUpdate();
		ps.close();
		
		if(log>0) {
			
	
			System.out.println("Date inserted");
			return true;
		}
		
		}catch(SQLException sqe) {
			sqe.printStackTrace();
			
		}
		
		
		return false;
	}
	
	
	

}
