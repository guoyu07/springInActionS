package com.chapter02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JugglerApp {

	/**
	 * @param args
	 * @throws PerformanceException 
	 */
	public static void main(String[] args) throws PerformanceException {
		// TODO Auto-generated method stub
		//Ϊɶ����Ŀ��Ŀ¼���Ҳ���xml�ļ���
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter02.xml");
//		Performer performer = (Performer)ctx.getBean("duke");
//		performer.perform();
		
		Performer performer2 = (Performer)ctx.getBean("kenny");
		performer2.perform();
		
//		Performer performer3 = (Performer)ctx.getBean("hank");
//		performer3.perform();
	}

}
