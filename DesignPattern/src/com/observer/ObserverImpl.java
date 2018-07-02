package com.observer;

public class ObserverImpl implements Observer {

	String name;
	
	public ObserverImpl(String name) {
		this.name=name;
	}
	
	@Override
	public void update(String productType,String productBrand) {
		System.out.println(this.name + ", "+productBrand+" "+productType +" has come down");
	}

}
