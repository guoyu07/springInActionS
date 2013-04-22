package com.ruicaihua.chapter01.hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HelloApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("hello.xml"));
		IHelloWorld  hi = (IHelloWorld)factory.getBean("helloWorldService");
		hi.sayHello();
	}

}
