package com.decorator;

public class Birds extends AnimalDecorator {

	Birds(Animal animal) {
		super(animal);
	}

	public void doWork() {
		animal.doWork();
		System.out.println("Birds work");
		fly();
		System.out.println("Birds flew");
	}

	private void fly() {
		System.out.println("Inside fly ");
	}
}
