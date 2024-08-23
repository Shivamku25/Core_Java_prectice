package com.core_java.oops.ExceptionTest;

public class Exception1 {

	public static void main(String[] args) {
		try
		{
			System.out.println("hello"+" "+1/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("World");
		}

	}

}
