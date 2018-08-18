package com.creational.abstractFactory;

public class FactoryProducer {

	public static MobileAbstractFactory getFactory(String choice) {
		if (choice.equals("MobileBrand"))
			return new MobileBrandFactory();
		else if (choice.equals("MobileColour"))
			return new MobileColourFactory();
		else
			return null;
	}

}
