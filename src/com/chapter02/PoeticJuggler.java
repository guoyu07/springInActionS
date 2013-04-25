package com.chapter02;

public class PoeticJuggler extends Juggler {
	private Poem poem;
	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("WHILE RECITING......");
		poem.recite();
	}
}
