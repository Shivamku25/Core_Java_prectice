package com.core_java.oops.Exception;

public class Throw1 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a%5==0)
			throw new ArithmeticException("galat hai");
		else
			System.out.println("All ok");
		System.out.println(" Normal flow");
				
	}

}
