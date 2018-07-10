package com.decorator;

public abstract class AnimalDecorator implements Animal {
	Animal animal;

	AnimalDecorator(Animal animal) {
		this.animal = animal;
	}
}
