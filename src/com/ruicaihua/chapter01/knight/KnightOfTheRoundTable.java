package com.ruicaihua.chapter01.knight;

public class KnightOfTheRoundTable implements Knight {
	private String name;
	private HolyGrailQuest quest;
	public KnightOfTheRoundTable(String name) {
		this.name = name;
	}
	
	public Object embarkOnQuest() throws Exception {
		return quest.embark();
	}

	public void setQuest(HolyGrailQuest quest) {
		this.quest = quest;
	}
}
