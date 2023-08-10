package com.digit;

public class Employee {
	int id;
	String name;
	
	public Employee() {
		this.id=200;
		this.name="Digit";
	}
	
	public Employee(int id) {
		this.id=id;
	}
	
	public Employee(String name) {
		this.name=name;
	}
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void getData() {
		System.out.println(id);
		System.out.println(name);
	}
	

}
