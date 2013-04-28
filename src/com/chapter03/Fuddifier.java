package com.chapter03;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;

/**
 * 利用BeanPostProcessor修改String属性
 * @author ruich
 *
 */
public class Fuddifier implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String name)
			throws BeansException {
		// TODO Auto-generated method stub
		/**
		 * 初始化之前什么都不做
		 */
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String name)
			throws BeansException {
		// TODO Auto-generated method stub
		/**
		 * “填满”Bean的所有字符串属性
		 */
		Field[] fields = bean.getClass().getDeclaredFields();
		try {
			for(int i=0;i<fields.length;i++) {
				if(fields[i].getType().equals(java.lang.String.class)) {
					fields[i].setAccessible(true);
					String original = (String)fields[i].get(bean);
					fields[i].set(bean, fuddify(original));
				}
			}
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	public String fuddify(String orig) {
		/**
		 * “填满”Bean的所有字符串属性
		 */
		if(orig == null) 	return orig;
		return orig.replaceAll("(r|l)", "w").replaceAll("(R|L)", "W");
	}

}
