package com.digit.ConstructorInjuction2;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {
		Resource cxml = new ClassPathResource("applicationContext.xml");
		XmlBeanFactory beanFactory = new XmlBeanFactory(cxml);
		Student stu=(Student)beanFactory.getBean("stud1");
		stu.display();
	}

}
