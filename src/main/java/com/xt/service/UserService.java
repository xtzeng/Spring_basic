package com.xt.service;

import com.xt.dao.UserDAO;
import com.xt.dao.impl.UserDAOImpl;
import com.xt.model.User;

public class UserService {

	private UserDAO userDAO;
	
	public void add(User u) {
		this.userDAO.save(u);
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	
	
}
