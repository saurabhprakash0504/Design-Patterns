package com.structural.decorator;

public abstract class HouseDecorator implements House {

	House house;

	HouseDecorator(House house) {
		this.house = house;
	}

	public void houseMaking() {
		System.out.println("decorator house making ");
	}
}
