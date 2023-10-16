package com.moniga.dmd;

public class TeamLead extends Employee{

	@Override
	void calculateSalary(int experience) {
		System.out.println("In TeamLead");
		System.out.println("Salary: "+5000*experience);
	}
	
	void showProjectProgress() {
		System.out.println("In TeamLead");
		System.out.println("65%");
	}
}
