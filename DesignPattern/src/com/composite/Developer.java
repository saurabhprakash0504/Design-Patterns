package com.composite;

import java.util.ArrayList;
import java.util.List;

public class Developer implements Employee {

	
	String name;
	int salary;

	Developer(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee e) {
		
	}

	@Override
	public void remove(Employee e) {
	
	}

	@Override
	public void print() {
		System.out.println("developer name >>" + name);
		System.out.println("developer salary >> " + salary);

	}

}
