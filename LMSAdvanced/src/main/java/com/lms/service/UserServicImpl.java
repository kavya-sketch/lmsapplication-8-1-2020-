package com.lms.service;

import java.sql.SQLException;

import com.lms.dao.UserDAO;

public class UserServicImpl implements UserService{
	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return this.userDAO;
		
	}
	public void setUserDAO(UserDAO userDAO)
	{
		this.userDAO=userDAO;
	}
	
	
public boolean isValidUser(String username,String password) throws SQLException{
	return userDAO.isValidUser(username,password);
}



















 
