package com.structural.proxy;

public class RealInternet implements InternetSubject{

	@Override
	public void connectTo(String ipname) {
		System.out.println("connecting to realInternet "+ipname);
	}

}
