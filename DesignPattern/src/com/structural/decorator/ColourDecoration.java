package com.structural.decorator;

public class ColourDecoration extends HouseDecorator {

	ColourDecoration(House house) {
		super(house);
	}

	void colourDecoration() {
		System.out.println("colour decoration ");
	}

	public void houseMaking() {
		colourDecoration();
		house.houseMaking();

	}
}
