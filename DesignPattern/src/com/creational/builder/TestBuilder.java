package com.creational.builder;

public class TestBuilder {
	public static void main(String[] args) {
		BankAccount account = new BankAccount.Builder(123L)
								  .atBranch("Patna")
								  .atRate(10)
								  .openingBalance(100.0)
								  .build();
		
		account.print();
	}
}
