package com.chapter02;

import java.util.Collection;
import java.util.Map;

public class OneManBand implements Performer {
	private Collection<Instrument> instruments;
	private Map<String, Instrument> mapTest;
	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("Playing songs : ");
//		for(Instrument instrument : instruments) {
//			instrument.play();
//		}
		for(String key : mapTest.keySet()) {
			System.out.print(key + " : ");
			Instrument instrument = mapTest.get(key);
			instrument.play();
		}
	}
	public Collection<Instrument> getInstruments() {
		return instruments;
	}
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
	public Map<String, Instrument> getMapTest() {
		return mapTest;
	}
	public void setMapTest(Map<String, Instrument> mapTest) {
		this.mapTest = mapTest;
	}

}
