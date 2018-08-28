package com.structural.facade;

public class AppleMobile implements Mobile{

	@Override
	public void brand() {
		System.out.println("Apple");
	}

	@Override
	public void model() {
		System.out.println("Iphone X");
	}

}
