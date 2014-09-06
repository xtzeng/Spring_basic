package com.immutbale.alias.dao.impl;

import org.springframework.stereotype.Repository;

import com.immutable.alias.dao.UserDAO;
import com.immutable.alias.model.User;

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


	public void delete() {
		System.out.println("user deteleted");
		
	}
	
	
}
