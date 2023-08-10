package com.digit.ConstructorInjuction4;

public class Institute_Dtls {
	
	String name;
	int yoe;
	int turnOver;
	public Institute_Dtls(String name, int yoe, int turnOver) {
		super();
		this.name = name;
		this.yoe = yoe;
		this.turnOver = turnOver;
	}
	public void display() {
		System.out.println(name);
		System.out.println(yoe);
		System.out.println(turnOver);
	}

}
