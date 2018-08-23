package com.structural.adapter.classes;

import java.util.HashMap;

public class TestClass {
	public static void main(String[] args) {

		double square = new MathematicalAdapter().squareOfNumber(5);
		System.out.println("square >>> " + square);
		
		double squareRoot = new MathematicalAdapter().halfOfNumber(5);
		System.out.println("half number >>> " + squareRoot);
		
		HashMap<Integer,String> h=new HashMap<>(17);
		
	}
}
