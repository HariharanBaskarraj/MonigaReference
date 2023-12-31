package com.javatraining.arrayofobjects;

import java.util.Scanner;

public class ArrayOfObjects extends Employee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Employee[] employees = new Employee[4];
		int itr = 0;

		// Populating the Employee Array
		while (itr < 4) {
			employees[itr] = new Employee();

			System.out.println("Enter name: ");
			String name = scanner.nextLine();
			employees[itr].setName(name);

			System.out.println("Enter ID:");
			int id = scanner.nextInt();
			scanner.nextLine();
			employees[itr].setEmployeeId(id);

			System.out.println("Enter department:");
			String dept = scanner.nextLine();
			employees[itr].setDepartment(dept);

			itr++;
		}

		// Looping through the Array - Regular For
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		
		// Looping through the Array - Enhanced For
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		// To prevent memory leak
		scanner.close();
	}

}
