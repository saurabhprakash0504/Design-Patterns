package com.composite;

public class TestComposite {

	public static void main(String[] args) {
		Developer d=new Developer("saurabh", 1000);
		Developer d1=new Developer("saurabh1", 2000);
		Manager m=new Manager("Thakur", 18);
		m.add(d);
		m.add(d1);
		m.print();
		
	}
	
}
