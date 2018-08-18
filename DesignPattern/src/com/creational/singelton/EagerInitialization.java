package com.creational.singelton;

public class EagerInitialization {

	public static final EagerInitialization instance = new EagerInitialization();

	private EagerInitialization() {
	}

	public static EagerInitialization getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		EagerInitialization firstInstance = EagerInitialization.getInstance();
		EagerInitialization secondInstance = EagerInitialization.getInstance();
		if (firstInstance == secondInstance)
			System.out.println("same");
		else
			System.out.println("not same ");
	}
}
