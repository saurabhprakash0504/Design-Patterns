package com.prototype;

public class TestClass {
	public static void main(String[] args) {
		Person person1 = new Person("saurabh");
		Person person2 = (Person) person1.doClone();
		System.out.println("person2 name " + person2.name);
		if (person1 == person2)
			System.out.println("true");
		else
			System.out.println("false");
		
		
		//Animal example
		
		Animal animalType1=new Animal("Lion");
		Animal animalType2=(Animal)animalType1.doClone();
		System.out.println("Animal Type 2 >>> "+animalType2.animalType);
	}
}
