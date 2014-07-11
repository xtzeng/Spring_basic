package com.xt.service;



import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import com.xt.dao.UserDAO;
import com.xt.model.User;

public class UserService {

	@Autowired
	@Qualifier("u")
	private UserDAO userDAO;
	
	public void init() {
		System.out.println("init.........");
	}
	
	public void add(User u) {
		this.userDAO.save(u);
	}

	
	public void destroy() {
		System.out.println("destroy.........");
	}
}
