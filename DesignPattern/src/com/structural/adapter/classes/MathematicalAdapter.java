package com.structural.adapter.classes;

public class MathematicalAdapter extends AdapteeInterfaceImpl implements TargetInterface {

	@Override
	public double squareOfNumber(int a) {
		return multiplicationOfNumber(a, a);
	}

	@Override
	public double halfOfNumber(int a) {
		return divisionOfNumber(a, 2);
	}

}
