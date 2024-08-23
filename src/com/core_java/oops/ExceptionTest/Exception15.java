package com.core_java.oops.ExceptionTest;

public class Exception15 {
	public static void main(String[] args) {
		try
		{
			System.out.println("A");
			int num = 99/0;
			System.out.println("B");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("C");
		}
		catch(Exception ex)
		{
			System.out.println("D");
		}
		finally
		{
			System.out.println("E");
		}
		
		System.out.println("F");
	}
	

}
