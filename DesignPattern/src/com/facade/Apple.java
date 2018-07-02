package com.facade;

public class Apple implements Mobile{

	@Override
	public void brand() {
		System.out.println("Apple");
	}

	@Override
	public void model() {
		System.out.println("Iphone X");
	}

}
