package com.javatraining.staticimport;

import static com.javatraining.staticdemo.twoclass.Doctor.experience;
import static com.javatraining.staticdemo.twoclass.Doctor.getExperience;
import static com.javatraining.staticdemo.twoclass.Doctor.hospital;

import com.javatraining.staticdemo.twoclass.Doctor;

public class StaticImport {

	public static void main(String[] args) {

//		Doctor doctor = new Doctor("Moniga", "Cardio");
//		System.out.println(doctor.getName() + " " + doctor.getSpeciality() + " " + Doctor.getExperience() + " "
//				+ Doctor.getHospital());
		System.out.println(getExperience());
		System.out.println(Doctor.experience);
		System.out.println(experience);  //Same as above
		System.out.println(hospital);
	}

}
