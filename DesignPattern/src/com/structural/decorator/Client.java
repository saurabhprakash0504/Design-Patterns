package com.structural.decorator;

public class Client {

	public static void main(String[] args) {
		House house = new ColourDecoration(new LightDecoration(new HouseImpl()));
		house.houseMaking();

		System.out.println("<<<<<>>>>>>");

		House house2 = (new LightDecoration(new ColourDecoration(new HouseImpl())));
		house2.houseMaking();

	}

}
