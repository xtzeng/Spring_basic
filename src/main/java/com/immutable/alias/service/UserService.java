package com.immutable.alias.service;

import com.immutable.alias.dao.UserDAO;
import com.immutable.alias.dao.impl.UserDAOImpl;
import com.immutable.alias.model.User;

public class UserService {

	private UserDAO userDAO = new UserDAOImpl();
	
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
