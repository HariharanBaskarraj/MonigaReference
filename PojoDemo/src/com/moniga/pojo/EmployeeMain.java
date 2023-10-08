package com.moniga.pojo;

import java.util.Date;

public class EmployeeMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Moniga");
		employee.setEmployeeId(52);
		employee.setDateOfJoining(new Date(2022,12,5));
		System.out.println(employee.toString());
		System.out.println();
		
		Employee employee2 = new Employee("Hari",53,new Date(2023,9,24));
		System.out.println(employee2);
		
		System.out.println(employee2.getName());
		System.out.println(employee.getEmployeeId());
		
		String a="45";
		System.out.println(a.getClass());
		System.out.println(Double.parseDouble(a));
		
	}

}
