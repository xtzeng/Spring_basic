package com.immutable.alias.service;

import com.immutable.alias.dao.UserDAO;
import com.immutable.alias.dao.impl.UserDAOImpl;
import com.immutable.alias.model.User;

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
