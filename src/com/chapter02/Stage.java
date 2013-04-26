package com.chapter02;

/**
 * ������ʾ��
 * @author ruich
 *
 */
public class Stage {
	private Stage() {}
	private static class StageSingletonHolder {
		//�򵥵�װ��ʵ��
		static Stage instance = new Stage();
	}
	public static Stage getInstance() {
		//����ʵ��,���ڰ�ȫ���ǣ�getInstance����ʹ�á�initialization on demand holder����������������ʵ��
		return StageSingletonHolder.instance;
	}
}
