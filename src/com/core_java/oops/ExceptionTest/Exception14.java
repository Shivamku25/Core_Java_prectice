package com.core_java.oops.ExceptionTest;

public class Exception14 {

	public static void main(String[] args) {
		try
		{
			badMethod();
			System.out.println("A");
		}catch(Exception ex)
		{
			System.out.println("B");
		}
		finally
		{
			System.out.println("C");
		}
		System.out.println("D");
	    }
		public static void badMethod()
		{
			throw new RuntimeException();
		}

}
