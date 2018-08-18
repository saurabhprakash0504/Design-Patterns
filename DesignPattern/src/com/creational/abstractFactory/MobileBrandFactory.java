package com.creational.abstractFactory;

public class MobileBrandFactory extends MobileAbstractFactory{

	@Override
	MobileBrand getbrand(String brandName) {
		MobileBrand brand=null;
		if(brandName.equals("LG"))
			brand=new LGBrand();
		else if(brandName.equals("Samsung"))
			brand=new SamsungBrand();
		return brand;
	}

	@Override
	MobileColour getColour(String colourName) {
		// TODO Auto-generated method stub
		return null;
	}

}
