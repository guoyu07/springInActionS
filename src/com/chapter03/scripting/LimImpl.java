package com.chapter03.scripting;

public class LimImpl implements Lime {
/**
 * 除了可以在spring里配置脚本化的bean，并装配到POJO属性。
 * 还可以实现相反注入，向脚本注入属性
 * 使coconut是个脚本化的bean，而lime是基于java的POJO
 */
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Called the doctor woke him up!");
	}

}
