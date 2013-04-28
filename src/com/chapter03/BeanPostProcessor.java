package com.chapter03;

import org.springframework.beans.BeansException;

public interface BeanPostProcessor {
	Object postProcessBeforeInitialization(Object bean, String name) throws BeansException;
	Object postProcessAfterInitialization(Object bean, String name) throws BeansException;
}
