package com.structural.adapter.classes;

public class TestClass {
	public static void main(String[] args) {

		double square = new MathematicalAdapter().squareOfNumber(5);
		System.out.println("square >>> " + square);
		
		double squareRoot = new MathematicalAdapter().halfOfNumber(5);
		System.out.println("half number >>> " + squareRoot);
		
	}
}
