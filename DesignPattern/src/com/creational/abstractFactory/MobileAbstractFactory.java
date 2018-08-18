package com.creational.abstractFactory;

public abstract class MobileAbstractFactory {

	abstract MobileBrand getbrand(String brandName);
	abstract MobileColour getColour(String colourName);
	
}
