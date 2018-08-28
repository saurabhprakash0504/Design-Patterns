package com.structural.facade;

public class FacadeClass {
	SamsungMobile sm;
	AppleMobile a;
	
	FacadeClass() {
		sm=new SamsungMobile();
		a=new AppleMobile();
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
