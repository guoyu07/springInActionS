package com.chapter03;

import com.chapter02.PerformanceException;
import com.chapter02.Performer;

public class Magician implements Performer {
	private MagicBox magicBox; 
	private String magicWords;
	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println(magicWords);
		System.out.println("The magic box contains......");
		System.out.println(magicBox.getContents());
	}
	public MagicBox getMagicBox() {
		return magicBox;
	}
	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox;
	}
	public String getMagicWords() {
		return magicWords;
	}
	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}

}
