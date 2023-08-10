package com.digit.ConstructorInjuction3;

import java.util.Iterator;
import java.util.List;

public class Institute {
	int int_id;
	String statement;
	List name;

	public Institute(int int_id, String statement, List name) {
		super();
		this.int_id = int_id;
		this.statement = statement;
		this.name = name;
	}

	public void display() {
		System.out.println(int_id + ". " + statement);
		Iterator itr = name.iterator();
		while (itr.hasNext() == true) {
			System.out.println(itr.next());
		}
	}

}
