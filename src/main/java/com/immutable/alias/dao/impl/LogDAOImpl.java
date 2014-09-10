package com.immutable.alias.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.immutable.alias.dao.LogDAO;
import com.immutable.alias.model.Log;

@Repository("logDAO")
public class LogDAOImpl implements LogDAO{
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Log log) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(log);
		//throw new RuntimeException("error!");
	}

}
