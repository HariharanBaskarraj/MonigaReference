package com.javatraining.abstraction.bank;

public class BankImpl {
	public static void main(String[] args) {
		AbstractBank bank = new BranchOne();
		bank.carLoan();
		bank.housingLoan();
		bank.admin();
	}
}
