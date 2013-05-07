package com.chapter03.scripting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScriptApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter03.xml");
		ICoconut cc = (ICoconut) ctx.getBean("coconut");
		cc.drinkThemBothUp();
		/**
		 *  jruby为啥要带上asm.jar
		 */
	}

}
