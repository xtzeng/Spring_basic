package com.xt.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.xt.dao.UserDAO;
import com.xt.model.User;

@Service("userService")
public class UserService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="userDAOImpl")
	private UserDAO userDAOImpl;
	
	public void add(User u) {
		this.userDAOImpl.save(u);
	}

	public void init() {
		logger.info("init....");
	}
	
	public void destroy() {
		logger.info("destroy....");
	}
}
