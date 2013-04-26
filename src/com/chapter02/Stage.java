package com.chapter02;

/**
 * 单例类示例
 * @author ruich
 *
 */
public class Stage {
	private Stage() {}
	private static class StageSingletonHolder {
		//简单的装载实例
		static Stage instance = new Stage();
	}
	public static Stage getInstance() {
		//返回实例,出于安全考虑，getInstance（）使用“initialization on demand holder”技术来创建单例实例
		return StageSingletonHolder.instance;
	}
}
