package com.chapter03.scripting;
/**
 * ¸øÒ¬×ÓÉÏLime
 * @author ruich
 *
 */
public class Coconut implements ICoconut {
	private Lime lime;
	
	@Override
	public void drinkThemBothUp() {
		System.out.println("You put the lime in the coconut...");
		System.out.println("and drink 'em both up...");
		System.out.println("You put the lime in the coconut...");
		lime.drink();
	}
	
	//injected
	public void setLime(Lime lime) {
		this.lime = lime;
	}
}
