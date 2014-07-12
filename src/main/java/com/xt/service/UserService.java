package com.xt.service;




import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import org.springframework.stereotype.Service;

import com.xt.dao.UserDAO;
import com.xt.model.User;

@Service("userService")
public class UserService {

	@Autowired
	@Qualifier("u")
	private UserDAO userDAO;
	
	@PostConstruct
	public void init() {
		System.out.println("init.........");
	}
	
	public void add(User u) {
		this.userDAO.save(u);
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy.........");
	}
}
