package com.xt.service;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xt.model.User;


public class UserServiceTest {

	@Test
	public void testAdd() throws SecurityException, IllegalArgumentException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		u.setCreate_time(new Date());
		userService.add(u);
		ctx.destroy();
		
	}

}
