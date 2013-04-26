package com.chapter02;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Instrumentalist implements Performer, InitializingBean, DisposableBean {
	private String song;
	private Instrument instrument;
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
		instrument.play();
	}
	
	public void tuneInstrument() {
		instrument.tune();
	}
	
	public void cleanInstrument() {
		instrument.clean();
	}
	
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		instrument.tune();
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		instrument.clean();
	}

}
