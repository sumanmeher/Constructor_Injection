package com.digit.ConstructorInjuction2;

public class Student {
	
	int sid;
	String name;
	Parent p;
	
	public Student(int sid, String name, Parent p) {
		super();
		this.sid = sid;
		this.name = name;
		this.p = p;
	}
	public void display() {
		System.out.println(sid);
		System.out.println(name);
		p.display();
	}
	

}
