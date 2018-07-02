package com.template;

public abstract class House {

	 final void development() {
		 foundation();
		 walls();
		 windows();
		 decoration();
		 
	}
	
	 abstract void walls();
	 abstract void decoration();
	 
	 void foundation() {
		 System.out.println("house foundation >> ");
	 }
	 
	 void windows() {
		 System.out.println(" hpuse windows >>>");
	 }
}
