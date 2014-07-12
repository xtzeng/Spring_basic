package com.xt.dao.impl;

import org.springframework.stereotype.Repository;

import com.xt.dao.UserDAO;
import com.xt.model.User;

@Repository("u")
public class UserDAOImpl implements UserDAO{

	
	@Override
	public void save(User u) {
		//Hibernate
		//JDBC
		//xml
		//network
		System.out.println("a user saved!");
	}



	
	
}
