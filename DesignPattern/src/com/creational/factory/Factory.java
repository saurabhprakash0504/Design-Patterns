package com.creational.factory;

public class Factory {

	Mobile getMobile(String str) {
		Mobile mobile = null;

		if (str.equals("LG"))
			mobile = new LGMobile();
		else if (str.equals("Samsung"))
			mobile = new SamsungMobile();
		return mobile;
	}

}
