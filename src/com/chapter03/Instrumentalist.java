package com.chapter03;

import com.chapter02.Instrument;
import com.chapter02.PerformanceException;
import com.chapter02.Performer;
/**
 * ��ȡ��ע�룬ʹ�÷���ע��,����,<lookup-method>����ȡ
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
		//ʹ��ע���getInstrument����
		getInstrument().play();
	}
	
	//ע��getInstrument����
	public abstract Instrument getInstrument();

}
