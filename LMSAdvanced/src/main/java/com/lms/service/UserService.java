package com.lms.service;

import java.sql.SQLException;
/**
 * @author KAVYA
 *
 */

public interface UserService {

	
	public boolean isValidUser(String username,String password) throws SQLException;
}
