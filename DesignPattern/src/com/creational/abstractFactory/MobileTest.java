package com.creational.abstractFactory;

public class MobileTest {
	public static void main(String[] args) {
		MobileAbstractFactory mobileAbstractFactory = FactoryProducer.getFactory("MobileBrand");
		MobileBrand mobileBrand = mobileAbstractFactory.getbrand("LG");
		mobileBrand.brand();
		mobileBrand = mobileAbstractFactory.getbrand("Samsung");
		mobileBrand.brand();

		mobileAbstractFactory = FactoryProducer.getFactory("MobileColour");
		MobileColour mobileColour = mobileAbstractFactory.getColour("lavendar blue");
		mobileColour.colour();
		mobileColour = mobileAbstractFactory.getColour("sea green");
		mobileColour.colour();
	}
}
