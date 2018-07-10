package com.decorator;

public class Lion extends AnimalDecorator {

	Lion(Animal animal) {
		super(animal);
	}

	public void doWork() {
		animal.doWork();
		System.out.println("Lion work");
		roar();
		System.out.println("Lion roared");
	}

	private void roar() {
		System.out.println("Inside roar ");
	}

}
