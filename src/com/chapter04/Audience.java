package com.chapter04;

public class Audience {
	//在表演之前执行 takeSeats 和 turnOffCellPhones
	public void takeSeats() {
		System.out.println("The audience is taking their seats.");
	}
	public void turnOffCellPhones() {
		System.out.println("The audience is turning off theri cellphones");
	}
	
	//在表演成功之后执行
	public void applaud() {
		System.out.println("CLAP CLAP CLAP CLAP CLAP CLAP CLAP");
	}
	
	//在表演不成功之后执行
	public void demandRefund() {
		System.out.println("Boo! We want our money back!");
	}
}
