package com.moniga.dmd;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new TeamLead();
		employee.calculateSalary(5);
		employee.showRemainingLeaves();
		System.out.println();
		
		employee = new Developer();
		employee.calculateSalary(50);
		employee.showRemainingLeaves();
		System.out.println();
		
		TeamLead lead = new TeamLead();
		lead.calculateSalary(54);
		lead.showProjectProgress();
		lead.showRemainingLeaves();
		
		Developer lead2 = (Developer)employee;
		lead2.calculateSalary(54);
		lead2.showJira();
		lead2.showRemainingLeaves();
	}

}
