package com.xt.service;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xt.dao.UserDAO;
import com.xt.model.User;

public class UserService {

	@Resource(name="userDAO")
	private UserDAO userDAO;
	
	public void init() {
		System.out.println("init.........");
	}
	
	public void add(User u) {
		this.userDAO.save(u);
	}

	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void destroy() {
		System.out.println("destroy.........");
	}
}
