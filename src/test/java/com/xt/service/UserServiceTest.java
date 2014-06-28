package com.xt.service;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xt.model.User;


public class UserServiceTest {

	@Test
	public void testAdd() throws SecurityException, IllegalArgumentException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService.getClass());
		User u = new User();
		u.setName("hello");
		u.setPassword("zhangsan");
		userService.add(u);
		
	}

}
