package com.chapter01.knight;

import junit.framework.TestCase;

public class KnightOfTheRoundTableTest extends TestCase {
	public void testEmbarkOnQuest() throws Exception {
		KnightOfTheRoundTable knight = new KnightOfTheRoundTable("qichengjie");
		HolyGrail grail = (HolyGrail) knight.embarkOnQuest();
		assertNotNull(grail);
		assertTrue(grail.isHoly());
	}
}
