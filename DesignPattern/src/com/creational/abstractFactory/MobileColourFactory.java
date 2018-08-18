package com.creational.abstractFactory;

public class MobileColourFactory extends MobileAbstractFactory {

	@Override
	MobileBrand getbrand(String brandName) {
		return null;
	}

	@Override
	MobileColour getColour(String colourName) {
		MobileColour mobileColour = null;
		if (colourName.equals("lavendar blue"))
			mobileColour = new LGColour();
		else if (colourName.equals("sea green"))
			mobileColour = new SamsungColour();
		return mobileColour;
	}

}
