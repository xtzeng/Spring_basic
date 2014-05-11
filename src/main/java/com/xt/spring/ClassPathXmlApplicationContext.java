package com.xt.spring;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class ClassPathXmlApplicationContext implements BeanFactory{
	
	private Map<String, Object> beans = new HashMap<String, Object>();

	
	public ClassPathXmlApplicationContext() throws JDOMException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		SAXBuilder sb = new SAXBuilder();
		//构造文档对象
		Document document = sb.build(this.getClass().getClassLoader().getResourceAsStream("beans.xml"));
		Element root = document.getRootElement();
		List<Element> list = root.getChildren("bean");
		for (int i = 0; i < list.size(); i++) {
			Element element = (Element)list.get(i);
			String id = element.getAttributeValue("id");
			String clazz = element.getAttributeValue("class");
			Object o = Class.forName(clazz).newInstance();
			System.out.println(id);
			System.out.println(clazz);
			beans.put(id, o);
			
			for (Element propertyElement : element.getChildren("property")) {
				String name = propertyElement.getAttributeValue("name");
				String bean = propertyElement.getAttributeValue("bean");
				Object beanObject = beans.get(bean);
				
				String methodName = "set" + name.substring(0,1).toUpperCase() + name.substring(1);
				System.out.println("method name =" + methodName);
				Method method = o.getClass().getMethod(methodName, beanObject.getClass().getInterfaces()[0]);
				method.invoke(o, beanObject);
			}
		}
	}
	
	@Override
	public Object getBean(String id) {
		
		return beans.get(id);
	}
	
	
}
