package com.xt.service;




import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xt.dao.LogDAO;
import com.xt.dao.UserDAO;
import com.xt.model.Log;
import com.xt.model.User;

@Service("userService")
public class UserService {

	@Autowired
	@Qualifier("u")
	private UserDAO userDAO;
	
	@Resource(name="logDAO")
	private LogDAO logDAO;
	
	@PostConstruct
	public void init() {
		System.out.println("init.........");
	}
	
	@Transactional
	public void add(User u) {
		
		userDAO.save(u);
		Log log = new Log();
		log.setMsg("a user saved!");
		logDAO.save(log);
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy.........");
	}
}
