package com.chapter02;

public class Saxophone implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("TOOT TOOT TOOT");	
	}

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("tuning Saxophone.......");
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("cleaning Saxophone......");
	}
}
