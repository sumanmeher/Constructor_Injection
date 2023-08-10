package com.digit.ConstructorInjuction4;

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
		Iterator<Institute_Dtls> itr = name.iterator();
		while (itr.hasNext() == true) {
			Institute_Dtls inst_dtl=itr.next();
			inst_dtl.display();
			System.out.println("-----------");
		}
	}

}
