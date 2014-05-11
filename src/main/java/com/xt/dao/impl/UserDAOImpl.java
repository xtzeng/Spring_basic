package com.xt.dao.impl;

import com.xt.dao.UserDAO;
import com.xt.model.User;

public class UserDAOImpl implements UserDAO{

	@Override
	public void save(User u) {
		System.out.println("a user saved!");
	}

}
