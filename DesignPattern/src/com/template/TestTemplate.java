package com.template;

public class TestTemplate {
	public static void main(String[] args) {
		House h=new GreenHouse();
		h.development();
		System.out.println("<<<<<<<<<<>>>>>>>>>>>>>>");
		h=new CementHouse();
		h.development();
	}
}
