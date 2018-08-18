package com.creational.builder;

public class BankAccount {
	private final long accountNumber; // This is important, so we'll pass it to the constructor.
	private final String owner;
	private final String branch;
	private final double balance;
	private final int interestRate;

	BankAccount(Builder builder) {
		this.accountNumber = builder.accountNumber;
		this.owner = builder.owner;
		this.branch = builder.branch;
		this.balance = builder.balance;
		this.interestRate = builder.interestRate;
	}

	public static class Builder {
		private final long accountNumber; // This is important, so we'll pass it to the constructor.
		private String owner = null;
		private String branch = null;
		private double balance = 0.0;
		private int interestRate = 0;

		public Builder(long accountNumber) {
			this.accountNumber = accountNumber;
		}

		public Builder withOwner(String owner) {
			this.owner = owner;
			return this; // By returning the builder each time, we can create a fluent interface.
		}

		public Builder atBranch(String branch) {
			this.branch = branch;
			return this;
		}

		public Builder openingBalance(double balance) {
			this.balance = balance;
			return this;
		}

		public Builder atRate(int interestRate) {
			this.interestRate = interestRate;
			return this;
		}

		public BankAccount build() {
			return new BankAccount(this);
		}
	}

	void print() {
		System.out.println("This is print method >> " + accountNumber + " >> " + owner + " >> " + branch + " >> "
				+ balance + " >> " + interestRate);
	}
}