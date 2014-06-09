package com.xt.service;

import com.xt.dao.UserDAO;
import com.xt.dao.impl.UserDAOImpl;
import com.xt.model.User;

public class UserService {

	private UserDAO userDAO;
	
	public void add(User u) {
		this.userDAO.save(u);
	}

	/**
	 * 用构造方法注入
	 * 构造方法没有返回值，但是可以传参
	 * @param userDAO
	 */
	public UserService(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}

	
	
}
