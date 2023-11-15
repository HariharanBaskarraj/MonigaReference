package com.javatraining.exceptions;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			System.out.println(12 / 0);
			System.out.println(Integer.parseInt("Moniga"));
			System.out.println(Class.forName("String"));
		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());         //Lower to higher hierarchy should be maintained
//		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
