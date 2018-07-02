package com.factory;

public class Factory {
	Mobile mobile;

	Factory(String str) {
		if (str.equals("LG"))
			mobile = new LGMobile();
		else if (str.equals("Samsung"))
			mobile = new SamsungMobile();
		else
			System.out.println("Invalid input");
	}

	void check() {
		if (null != mobile)
			mobile.calling();
	}

}
