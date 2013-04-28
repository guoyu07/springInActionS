package com.chapter03;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;

/**
 * ����BeanPostProcessor�޸�String����
 * @author ruich
 *
 */
public class Fuddifier implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String name)
			throws BeansException {
		// TODO Auto-generated method stub
		/**
		 * ��ʼ��֮ǰʲô������
		 */
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String name)
			throws BeansException {
		// TODO Auto-generated method stub
		/**
		 * ��������Bean�������ַ�������
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
		 * ��������Bean�������ַ�������
		 */
		if(orig == null) 	return orig;
		return orig.replaceAll("(r|l)", "w").replaceAll("(R|L)", "W");
	}

}
