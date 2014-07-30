package com.xt.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.xt.dao.UserDAO;
import com.xt.model.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO{

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(User u) {
		//Hibernate
		//JDBC
		//xml
		//network
		
		Session s = sessionFactory.getCurrentSession();
		
		s.save(u);
		
		//throw new RuntimeException("exeption!");
		//System.out.println("a user saved!");
	}


	
	
}
