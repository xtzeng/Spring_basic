package com.immutable.alias.service;




import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.immutable.alias.dao.LogDAO;
import com.immutable.alias.dao.UserDAO;
import com.immutable.alias.model.Log;
import com.immutable.alias.model.User;

@Service("userService")
public class UserService {

	@Autowired
	@Qualifier("userDAO")
	//@Resource(name="u")
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
		log.setLogTime(new Timestamp(new Date().getTime()));
		logDAO.save(log);
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy.........");
	}
}
