package com.creational.factory;

public class Test {

	public static void main(String[] args) {
		Factory factory = new Factory();

		Mobile mobile = factory.getMobile("Samsung");
		mobile.calling();
	}

}
