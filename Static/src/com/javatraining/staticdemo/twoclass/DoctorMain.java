package com.javatraining.staticdemo.twoclass;

public class DoctorMain {

	public static void main(String[] args) {
		Doctor doctor = new Doctor("Moniga", "Cardiologist");
		System.out.println(doctor.getName() + " " + doctor.getSpeciality() + " " + Doctor.getExperience());
		// Static way of calling methods :
		// ClassName.methodName();
	}

}
