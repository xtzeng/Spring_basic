package com.xt.dao.impl;

import com.xt.dao.UserDAO;
import com.xt.model.User;

public class UserDAOImpl implements UserDAO{

	private int daoId;
	private String daoStatus;
	
	@Override
	public void save(User u) {
		//Hibernate
		//JDBC
		//xml
		//network
		System.out.println("daoId=====" + daoId);
		System.out.println("daoStatus=======" + daoStatus);
		System.out.println("a user saved!");
	}

	public int getDaoId() {
		return daoId;
	}

	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}

	public String getDaoStatus() {
		return daoStatus;
	}

	public void setDaoStatus(String daoStatus) {
		this.daoStatus = daoStatus;
	}

	@Override
	public String toString() {
		return this.daoId+":" + this.daoStatus;
	}

	
	
}
