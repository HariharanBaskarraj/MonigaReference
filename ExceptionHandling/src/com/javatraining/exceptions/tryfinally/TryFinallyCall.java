package com.javatraining.exceptions.tryfinally;

public class TryFinallyCall {
	public static void main(String[] args) {
		TryFinally tryFinally = null;
		try {
			tryFinally = new TryFinally();
			String[] inputs = new String[2];
			inputs[0] = "Moniga";
			inputs[1] = "Arun";

			tryFinally.tryFinallyDemo(inputs);   //Exception occurs here
			
			System.out.println("Ji");
		} catch (ArithmeticException | NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Inside finally");
		}
	}
}
