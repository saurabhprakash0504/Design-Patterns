package com.structural.adapter;

public class MathematicalAdapter implements TargetInterface {

	AdapteeInterface adapteeInterface;

	MathematicalAdapter(AdapteeInterface adapteeInterface) {
		this.adapteeInterface = adapteeInterface;
	}

	@Override
	public double squareOfNumber(int a) {
		return adapteeInterface.multiplicationOfNumber(a, a);
	}

	@Override
	public double halfOfNumber(int a) {
		return adapteeInterface.divisionOfNumber(a, 2);
	}

}
