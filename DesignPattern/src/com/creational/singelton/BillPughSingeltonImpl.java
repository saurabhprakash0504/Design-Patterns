package com.creational.singelton;

public class BillPughSingeltonImpl {

	private BillPughSingeltonImpl() {
	}

	public static class SingeltonHelper {
		public static final BillPughSingeltonImpl instance = new BillPughSingeltonImpl();
	}

	public static BillPughSingeltonImpl getInstance() {
		return SingeltonHelper.instance;
	}

	public static void main(String[] args) {
		BillPughSingeltonImpl firstInstance = BillPughSingeltonImpl.getInstance();
		BillPughSingeltonImpl secondInstance = BillPughSingeltonImpl.getInstance();
		if (firstInstance == secondInstance)
			System.out.println("same");
		else
			System.out.println("not same ");
	}

}
