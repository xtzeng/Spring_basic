package com.immutable.alias.dao.impl;

import com.immutable.alias.dao.UserDAO;
import com.immutable.alias.model.User;

public class UserDAOImpl implements UserDAO{

	@Override
	public void save(User u) {
		System.out.println("a user saved!");
	}

}
