package com.decorator;

public class TestClass {

	public static void main(String[] args) {
		Animal animal = new AnimalImpl();
		animal.doWork();
		
		System.out.println("\n\n");
		
		animal = new Birds(animal);
		animal.doWork();

		System.out.println("\n\n");
		
		animal = new Lion(animal);
		animal.doWork();
	}

}
