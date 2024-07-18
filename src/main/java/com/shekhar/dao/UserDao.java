package com.shekhar.dao;

public interface UserDao {
	
	boolean isValidUser(String email, String password);
	
	boolean registerNewUser(String firstName, String lastName, String email, String password);

}
