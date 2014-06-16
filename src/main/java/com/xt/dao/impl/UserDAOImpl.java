package com.xt.dao.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.xt.dao.UserDAO;
import com.xt.model.User;

public class UserDAOImpl implements UserDAO{

	private Integer daoId;
	
	public Integer getDaoId() {
		return daoId;
	}
	public void setDaoId(Integer daoId) {
		this.daoId = daoId;
	}





	@Override
	public void save(User u) {
		System.out.println("daoId===="+daoId);
		System.out.println("user saved!");
		
	}

	@Override
	public String toString() {
		return "daoId===="+daoId;
	}
	
}
