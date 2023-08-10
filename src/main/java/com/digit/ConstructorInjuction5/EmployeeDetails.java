package com.digit.ConstructorInjuction5;


public class EmployeeDetails {
	int empId;
	String empName;
	int salary;
	
	public EmployeeDetails(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(salary);
	}
}
