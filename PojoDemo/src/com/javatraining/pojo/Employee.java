package com.javatraining.pojo;

import java.util.Date;

public class Employee {

	private String name;
	private int employeeId;
	private Date dateOfJoining;

	public Employee() {
		super();
	}

	public Employee(String name, int employeeId, Date dateOfJoining) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.dateOfJoining = dateOfJoining;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", dateOfJoining=" + dateOfJoining + "]";
	}

}
