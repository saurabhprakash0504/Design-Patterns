package com.creational.singelton;

public class DoubleCheckedLocking {

	public static volatile DoubleCheckedLocking instance;

	private DoubleCheckedLocking() {
	}

	public static DoubleCheckedLocking getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedLocking.class) {
				if (instance == null) {
					instance = new DoubleCheckedLocking();
				}

			}
		}

		return instance;
	}

	public static void main(String[] args) {
		DoubleCheckedLocking firstInstance = DoubleCheckedLocking.getInstance();
		DoubleCheckedLocking secondInstance = DoubleCheckedLocking.getInstance();
		if (firstInstance == secondInstance)
			System.out.println("same");
		else
			System.out.println("not same ");
	}

}
