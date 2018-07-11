package com.prototype;

public class Person implements HumanBeing {
	String name;

	Person(String name) {
		this.name = name;
	}

	@Override
	public HumanBeing doClone() {
		return new Person(name);
	}

}
