package com.immutbale.alias.dao.impl;

import com.immutable.alias.model.User;



public class UserDAOImpl2 extends UserDAOImpl {
	
	@Override
	public void save(User user) {
		
		System.out.println("save start...");
		super.save(user);
		System.out.println("save end...");
		
	}
	
	
}
