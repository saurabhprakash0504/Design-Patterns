package com.facade;

public class SamsungMobile implements Mobile{

	@Override
	public void brand() {
		System.out.println("Samsung");
	}

	@Override
	public void model() {
		System.out.println("s9");
	}

}
