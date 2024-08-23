package com.core_java.oops.ExceptionTest;

public class Exception5 {

	public static void main(String[] args) {
		int ary[]=new int[2];
		ary[10]=5;
		try
		{
			int number = 2/0;
		}
		catch(Exception e)
		{
			System.out.println("Divide by zero");
		}
		finally
		{
			System.out.println("inside FINALLY block");
		}

	}

}
