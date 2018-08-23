package com.structural.decorator;

public class LightDecoration extends HouseDecorator{

	LightDecoration(House house) {
		super(house);
	}
	
	void addLight() {
		System.out.println("adding light ");
	}

	public void houseMaking() {
		addLight();
		house.houseMaking();
		
	}
}
