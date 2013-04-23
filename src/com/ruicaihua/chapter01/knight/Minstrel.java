package com.ruicaihua.chapter01.knight;
import org.apache.log4j.Category;
import org.apache.log4j.Logger;
public class Minstrel {
	private final Logger SONG = Logger.getLogger(Minstrel.class);
	public void singBefore(KnightOfTheRoundTable knight) {
		SONG.info("Fa la la; Sir " + knight.getName() + " is so brave!");
	}
	
	public void singAfter(KnightOfTheRoundTable knight) {
		SONG.info("Thee-hee-he; Sir " + knight.getName() + " did embark on a quest");
	}
}
