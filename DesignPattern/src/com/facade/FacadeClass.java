package com.facade;

public class FacadeClass {
	SamsungMobile sm;
	Apple a;
	
	FacadeClass() {
		sm=new SamsungMobile();
		a=new Apple();
	}
	
	void samung() {
		sm.brand();
		sm.model();
	}
	
	void apple() {
		a.brand();
		a.model();
	}
	
}
