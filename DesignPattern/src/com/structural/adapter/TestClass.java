package com.structural.adapter;

public class TestClass {
	public static void main(String[] args) {
		AdapteeInterfaceImpl adapteeInterfaceImpl = new AdapteeInterfaceImpl();

		double square = new MathematicalAdapter(adapteeInterfaceImpl).squareOfNumber(5);
		System.out.println("square >>> " + square);
		
		double squareRoot = new MathematicalAdapter(adapteeInterfaceImpl).halfOfNumber(5);
		System.out.println("square >>> " + squareRoot);
		
	}
}
