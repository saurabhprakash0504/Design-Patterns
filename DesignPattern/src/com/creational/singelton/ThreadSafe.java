package com.creational.singelton;

public class ThreadSafe {

	public static volatile ThreadSafe instance;

	private ThreadSafe() {
	}

	public static synchronized ThreadSafe getInstance() {
		if (instance == null)
			instance = new ThreadSafe();
		return instance;
	}

	public static void main(String[] args) {
		ThreadSafe firstInstance = ThreadSafe.getInstance();
		ThreadSafe secondInstance = ThreadSafe.getInstance();
		if (firstInstance == secondInstance)
			System.out.println("same");
		else
			System.out.println("not same ");
	}

}
