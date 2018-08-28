package com.structural.proxy;

public class Client {
	public static void main(String[] args) {
		InternetSubject internetSubject = new ProxyInternet();
		try {
			internetSubject.connectTo("google.com");
			internetSubject.connectTo("abc.coms");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
