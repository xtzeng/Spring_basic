package com.immutbale.alias.dao.impl;

import com.immutable.alias.aop.LogInterceptor;
import com.immutable.alias.dao.UserDAO;
import com.immutable.alias.model.User;



public class UserDAOImpl3 implements UserDAO {
	
	private UserDAO userDAO = new UserDAOImpl();
	
	public void save(User user) {
		
		new LogInterceptor().beforeMethod(null);
		userDAO.save(user);
		
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}
}
