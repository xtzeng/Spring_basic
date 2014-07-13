package com.xt.dao.impl;

import com.xt.aop.LogInterceptor;
import com.xt.dao.UserDAO;
import com.xt.model.User;



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
