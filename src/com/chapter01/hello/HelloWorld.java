package com.chapter01.hello;

public class HelloWorld implements IHelloWorld {
	private String greeting;
	public HelloWorld() {}
	public HelloWorld(String greeting) {
		this.setGreeting(greeting);
	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(greeting);
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
