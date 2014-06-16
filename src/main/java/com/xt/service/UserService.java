package com.xt.service;


import com.xt.dao.UserDAO;
import com.xt.model.User;

public class UserService {

	private UserDAO userDAO;
	
	public void add(User u) {
		this.userDAO.save(u);
	}

	public void init() {
		System.out.println("init");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}


	/**
	 * 用构造方法注入
	 * 构造方法没有返回值，但是可以传参
	 * @param userDAO
	 */
	public UserService(UserDAO userDAO) {
		
		super();
		System.out.println("hello,this is constructor");
		this.userDAO = userDAO;
	}

	
	
	
	
}
