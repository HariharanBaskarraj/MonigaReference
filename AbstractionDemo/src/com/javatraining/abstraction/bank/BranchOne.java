package com.javatraining.abstraction.bank;

public class BranchOne extends AbstractBank {

	@Override
	void carLoan() {
		System.out.println("Car Loan 15%");
	}

	@Override
	void housingLoan() {
		System.out.println("Housing Loan 20%");
	}
	
	void myMethod() {
		System.out.println("Tax free");
	}

}
