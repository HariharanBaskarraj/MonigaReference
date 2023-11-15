package com.javatraining.abstraction.bank;

abstract class BranchTwo extends AbstractBank {

	@Override
	void carLoan() {
		System.out.println("Car Loan 15%");
	}

	abstract void housingLoan(); 

}
