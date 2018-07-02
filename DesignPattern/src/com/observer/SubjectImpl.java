package com.observer;

import java.util.ArrayList;

public class SubjectImpl implements Subject{
	
	SubjectImpl(String b,String t){
		productBrand=b;
		productType=t;
	}
	
	ArrayList<Observer> a=new ArrayList<>();
	String availability;
	String productBrand;
	String productType;
	
	public void setAvailability(String availability) {
		this.availability = availability;
		notifys();
	}

	@Override
	public void register(Observer o) {
	a.add(o);	
	}

	@Override
	public void unRegister(Observer o) {
		a.remove(o);
	}

	@Override
	public void notifys() {
		for(Observer aa:a) {
			aa.update(productType,productBrand);
		}
	}

}
