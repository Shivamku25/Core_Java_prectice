package com.core_java.oops.ExceptionTest;

public class Exception11 {
	public static void Throwit()
	{
		System.out.println("Throwit");
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		try
		{
			System.out.println("Hello");
		}
	catch(Exception re)
		{
		System.out.println("caught");
		}
		finally
		{
			System.out.println("Finally");
		}
		System.out.println("After");
	}
	

}
