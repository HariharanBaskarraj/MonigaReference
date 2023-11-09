package com.moniga.staticdemo.twoclass;

public class Doctor {

	private String name;
	private String speciality;
	public static int experience = 5; // Static Variable
	public static String hospital = "Apollo";

	public Doctor() {
		super();
	}

	public Doctor(String name, String speciality) {
		super();
		this.name = name;
		this.speciality = speciality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public static int getExperience() { // Static Method
		return experience;
	}

	public static String getHospital() {
		return hospital;
	}

	static { // Static block
		System.out.println("Doctor Class");
	}

	public static void printDetails() {
		System.out.println("Static inside POJO");
	}
}
