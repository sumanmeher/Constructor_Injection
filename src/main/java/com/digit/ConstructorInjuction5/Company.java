package com.digit.ConstructorInjuction5;

import java.util.Iterator;
import java.util.List;

import com.digit.ConstructorInjuction1.Employee;

public class Company {
	int comp_id;
	String cname;
	List<EmployeeDetails> name;

	public Company(int comp_id, String cname, List<EmployeeDetails> name) {
		super();
		this.comp_id = comp_id;
		this.cname = cname;
		this.name = name;
	}

	public void display() {
		System.out.println(comp_id + ". " + cname);
		Iterator<EmployeeDetails> itr = name.iterator();
		while (itr.hasNext() == true) {
			EmployeeDetails emp_dtl = itr.next();
			emp_dtl.display();
			System.out.println("-----------");
		}
	}
}
