package com.observer;

public class TestObserver {

	public static void main(String[] args) {
		Observer a=new ObserverImpl("Saurbh");
		Observer b=new ObserverImpl("Prakash");
		SubjectImpl s=new SubjectImpl("mobile","samsung");
		s.register(a);
		s.register(b);
		s.setAvailability("availabile");
		
	}
	
}
