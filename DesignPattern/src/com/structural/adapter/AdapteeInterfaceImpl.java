package com.structural.adapter;

public class AdapteeInterfaceImpl implements AdapteeInterface{

	@Override
	public double multiplicationOfNumber(int a, int b) {
		return a*b;
	}

	@Override
	public double divisionOfNumber(int a, int b) {
		return a/(b*1.0);
	}

}
