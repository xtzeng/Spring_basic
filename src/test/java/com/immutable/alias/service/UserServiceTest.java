package com.immutable.alias.service;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.immutable.alias.aop.LogInterceptor;
import com.immutable.alias.dao.UserDAO;
import com.immutable.alias.model.User;
import com.immutable.alias.service.UserService;
import com.immutbale.alias.dao.impl.UserDAOImpl;


public class UserServiceTest {

	@Test
	public void testAdd() throws SecurityException, IllegalArgumentException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = (UserService) ctx.getBean("userService",UserService.class);
//		User u = new User();
//		u.setUsername("zhangsan");
//		u.setPassword("zhangsan");
		userService.add(new User());
		ctx.destroy();
		
	}
	
	@Test
	public void testProxy() {
		UserDAO userDAO = new UserDAOImpl();
		LogInterceptor li = new LogInterceptor();
		li.setTarget(userDAO);
		UserDAO userDAOProxy = (UserDAO)Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), userDAO.getClass().getInterfaces(), li);
		System.out.println(userDAOProxy.getClass());
		userDAOProxy.delete();
		userDAOProxy.save(new User());
		
	}

}
