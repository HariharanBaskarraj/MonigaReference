package com.moniga.abstraction.bank;

abstract class AbstractBank {
	abstract void carLoan();
	abstract void housingLoan();
	
	public void admin() {
		System.out.println("Normal method....");
	}

}