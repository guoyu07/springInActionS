package com.chapter02;

public class Sonnet29 implements Poem {
	private static String LINES[] = {
		"When in diagrace with fortune and men's eyes,",
		"I all alone beweep my outcast state",
		"And trouble deaf haven with my bootless cries",
		"And look upon myself and curse my fate,"
	};
	@Override
	public void recite() {
		// TODO Auto-generated method stub
		for(int i=0;i<LINES.length;i++) {
			System.out.println(LINES[i]);
		}
	}

}
