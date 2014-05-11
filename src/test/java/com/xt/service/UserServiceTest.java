package com.xt.service;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.jdom2.JDOMException;
import org.junit.Test;

import com.xt.model.User;
import com.xt.spring.BeanFactory;
import com.xt.spring.ClassPathXmlApplicationContext;

public class UserServiceTest {

	@Test
	public void testAdd() throws SecurityException, IllegalArgumentException, JDOMException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
		
		BeanFactory factory = new ClassPathXmlApplicationContext();
		UserService userService = (UserService)factory.getBean("userService");
		User u = new User();
		userService.add(u);
	}

}
