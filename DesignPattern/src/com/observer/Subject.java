package com.observer;

public interface Subject {

	void register(Observer o);
	
	void unRegister(Observer o);
	
	void notifys();
	
}
