package com.chapter02;

public class Piano implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("PLINK PLINK PLINK");	
	}

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("tuning piano.......");
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("cleaning piano......");
	}

}
