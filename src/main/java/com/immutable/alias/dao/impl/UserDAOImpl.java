package com.immutable.alias.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.immutable.alias.dao.UserDAO;
import com.immutable.alias.model.User;

@Repository("userDAOImpl")
public class UserDAOImpl implements UserDAO{

	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Override
	public void save(User u) {
		//Hibernate
		//JDBC
		//xml
		//network
		logger.info("session factory class====="+sessionFactory.getClass());
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
		logger.info("a user is saved!!!");
	}

	
	
}
