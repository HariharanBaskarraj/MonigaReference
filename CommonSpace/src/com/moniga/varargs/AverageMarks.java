package com.moniga.varargs;

public class AverageMarks {

	public void cl1(int m1, int m2, int m3) {
		// Code for calculating average
	}

	public void cl2(int m1, int m2, int m3, int m4, int m5) {
		// Code for calculating average
	}

	// Var args implementation
	public void calculateAverage(int... marks) {
//		int[] marks = { 25, 35, 45, 55, 65 };
		int sum = 0;
		int average = 0;

		for (int mark : marks) {
			sum += mark;
		}

		average += sum / marks.length;
		System.out.println(average);
	}

	public void calculateAverage(String value, int... marks) {

		System.out.print("Name: " + value + "\nAverage: ");
		int sum = 0;
		int average = 0;

		for (int mark : marks) {
			sum += mark;
		}

		average += sum / marks.length;
		System.out.println(average);
	}
}
