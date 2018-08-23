package com.structural.composite;

public class ManagerLeaf implements EmployeeComponent {
	String name;
	int salary;

	ManagerLeaf(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void print() {
		System.out.println("manager name >>" + name);
		System.out.println("manager age >> " + salary);
	}

}
