package com.creational.singelton;

public class LazyInitialization {

	public static LazyInitialization instance;

	private LazyInitialization() {
	}

	public static LazyInitialization getInstance() {
		if (instance == null)
			instance = new LazyInitialization();
		return instance;
	}

	public static void main(String[] args) {
		LazyInitialization firstInstance = LazyInitialization.getInstance();
		LazyInitialization secondInstance = LazyInitialization.getInstance();
		if (firstInstance == secondInstance)
			System.out.println("same");
		else
			System.out.println("not same ");
	}
}
