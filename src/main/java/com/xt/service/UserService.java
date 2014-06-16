package com.xt.service;

import com.xt.dao.UserDAO;
import com.xt.dao.impl.UserDAOImpl;
import com.xt.model.User;

public class UserService {

	private UserDAO userDAO2;
	
	public void add(User u) {
		this.userDAO2.save(u);
	}

	
	/**
	 * UserDAO不用构造方法注入，要写getter&&setter
	 * @return
	 */
	
	public UserDAO getUserDAO2() {
		return userDAO2;
	}

	public void setUserDAO2(UserDAO userDAO2) {
		this.userDAO2 = userDAO2;
	}



	/**
	 * 用构造方法注入
	 * 构造方法没有返回值，但是可以传参
	 * @param userDAO
	 */
//	public UserService(UserDAO userDAO) {
//		
//		super();
//		System.out.println("hello,this is constructor");
//		this.userDAO = userDAO;
//	}

	
	
	
	
}
