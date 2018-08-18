package com.creational.singelton;

public class StaticBlockInitialization {

	public static StaticBlockInitialization instance;

	private StaticBlockInitialization() {
	}

	static {
		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {

		}
	}

	public static StaticBlockInitialization getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		StaticBlockInitialization firstInstance = StaticBlockInitialization.getInstance();
		StaticBlockInitialization secondInstance = StaticBlockInitialization.getInstance();
		if (firstInstance == secondInstance)
			System.out.println("same");
		else
			System.out.println("not same ");
	}

}
