package com.prototype;

public class Animal implements HumanBeing{

	String animalType;
	Animal(String animalType){
		this.animalType=animalType;
	}
	@Override
	public HumanBeing doClone() {
		return new Animal(animalType);
	}
	
}
