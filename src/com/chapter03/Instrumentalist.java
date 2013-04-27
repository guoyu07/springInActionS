package com.chapter03;

import com.chapter02.Instrument;
import com.chapter02.PerformanceException;
import com.chapter02.Performer;
/**
 * 获取器注入，使用方法注入,配置,<lookup-method>来获取
 * @author ruich
 *
 */
public abstract class Instrumentalist implements Performer{
	private String song;
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("Playing " + song + " : ");
		//使用注入的getInstrument（）
		getInstrument().play();
	}
	
	//注入getInstrument（）
	public abstract Instrument getInstrument();

}
