package com.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee{
	List<Employee> a = new ArrayList<>();
	String name;
	int age;
	
	Manager(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public void add(Employee e) {
		a.add(e);		
	}

	@Override
	public void remove(Employee e) {
		a.remove(e);		
	}

	@Override
	public void print() {
		System.out.println("manager name >>" + name);
		System.out.println("manager age >> " + age);
		Iterator<Employee> i=a.iterator();
		while(i.hasNext()) {
			Employee e=i.next();
			e.print();
		}
	}

	
	
}
