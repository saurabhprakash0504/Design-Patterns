package com.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements InternetSubject {

	static List<String> listOfInternet = new ArrayList<>();
	RealInternet realInternet = new RealInternet();
	static {
		listOfInternet.add("google.com");
		listOfInternet.add("yahoo.com");
		listOfInternet.add("abc.com");
		listOfInternet.add("xyz.com");
	}

	@Override
	public void connectTo(String ipname) throws Exception {
		if (!listOfInternet.contains(ipname)) {
			throw new Exception();
		}
		realInternet.connectTo(ipname);
	}

}
