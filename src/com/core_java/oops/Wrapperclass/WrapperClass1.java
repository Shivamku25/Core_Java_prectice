package com.core_java.oops.Wrapperclass;

public class WrapperClass1 {



	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if (b == 0) {
			System.out.println("Cannot divide by zero");
		} else {
			System.out.println("Division is " + (a / b));
		}
	}

}

