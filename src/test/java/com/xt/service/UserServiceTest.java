package com.xt.service;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xt.model.User;


public class UserServiceTest {

	@Test
	public void testAdd() throws SecurityException, IllegalArgumentException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
		
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = (UserService) factory.getBean("userService");
		UserService userService2 = (UserService) factory.getBean("userService");
//		User u = new User();
//		u.setUsername("zhangsan");
//		u.setPassword("zhangsan");
		userService.add(new User());
	}

}
