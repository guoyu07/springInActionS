package com.chapter03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter02.PerformanceException;
import com.chapter02.Performer;

public class MaigicApp {

	/**
	 * @param args
	 * @throws PerformanceException 
	 */
	public static void main(String[] args) throws PerformanceException {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter03.xml");
		Performer p1 = (Performer) ctx.getBean("harry");
		p1.perform();
	}

}
