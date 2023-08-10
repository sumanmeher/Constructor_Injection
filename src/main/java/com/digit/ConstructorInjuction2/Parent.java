package com.digit.ConstructorInjuction2;

public class Parent {
	String fname;
	String mname;
	int fage;
	int mage;
	public Parent(String fname, String mname, int fage, int mage) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.fage = fage;
		this.mage = mage;
	}
	public void display() {
		System.out.println(fname);
		System.out.println(mname);
		System.out.println(fage);
		System.out.println(mage);
	}
}
