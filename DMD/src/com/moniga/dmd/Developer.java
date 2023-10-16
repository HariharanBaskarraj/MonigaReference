package com.moniga.dmd;

public class Developer extends Employee {

	@Override
	void calculateSalary(int experience) {
		System.out.println("In Developer");
		System.out.println("Salary: "+3500*experience);
	}
	
	void showJira() {
		System.out.println("In Developer");
		System.out.println("5 points left");
	}
}
