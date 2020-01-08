package com.lms.dao;

import com.lms.entities.Login;
import com.lms.entities.User;

public interface UserDAO {
	void register(User user);
	User validateUser(Login login);
	

}
