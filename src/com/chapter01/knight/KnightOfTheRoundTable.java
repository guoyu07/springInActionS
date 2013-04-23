package com.chapter01.knight;

public class KnightOfTheRoundTable implements Knight {
	private String name;
	private HolyGrailQuest quest;
//	private Minstrel minstrel;
	public KnightOfTheRoundTable(String name) {
		this.setName(name);
	}
	
	public Object embarkOnQuest() throws Exception {
//		minstrel.singBefore(this);
		HolyGrail grail = (HolyGrail) quest.embark();
//		minstrel.singAfter(this);
		return grail;
	}

	public void setQuest(HolyGrailQuest quest) {
		this.quest = quest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public void setMinstrel(Minstrel minstrel) {
//		this.minstrel = minstrel;
//	}
}
