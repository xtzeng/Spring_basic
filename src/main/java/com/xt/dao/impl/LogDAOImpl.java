package com.xt.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.xt.dao.LogDAO;
import com.xt.model.Log;

@Repository("logDAO")
public class LogDAOImpl implements LogDAO{
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Log log) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(log);
	}

}
