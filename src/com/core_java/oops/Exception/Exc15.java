package com.core_java.oops.Exception;

public class Exc15 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			int res = 10 / 2;
			System.out.println("Result is: " + res);

		} catch (NumberFormatException e) {
			System.out.println("*Invalid input");
		}
		System.out.println("Main Completed");
	}
}


