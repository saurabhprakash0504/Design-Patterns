package com.structural.composite;

public class DeveloperLeaf implements EmployeeComponent {

	String name;
	int salary;

	DeveloperLeaf(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void print() {
		System.out.println("developer name >>" + name);
		System.out.println("developer salary >> " + salary);

	}

}
