package com.immutable.alias.service;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.immutable.alias.model.User;
import com.immutable.alias.service.UserService;


public class UserServiceTest {

	@Test
	public void testAdd() throws SecurityException, IllegalArgumentException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService.getClass());
		User u = new User();
		u.setName("hello");
		u.setPassword("pwd");
		u.setLastUpdateTime(new Date());
		userService.add(u);
		
	}

}
