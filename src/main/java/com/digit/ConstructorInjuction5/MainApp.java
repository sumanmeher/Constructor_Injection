package com.digit.ConstructorInjuction5;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
	public static void main(String[] args) {

		Resource cxml = new ClassPathResource("applicationContext.xml");
		XmlBeanFactory beanFactory = new XmlBeanFactory(cxml);
		Company c1 = (Company) beanFactory.getBean("comp-1");
		c1.display();
		
		Company c2 = (Company) beanFactory.getBean("comp-2");
		c2.display();

	}

}
