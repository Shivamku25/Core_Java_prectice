package com.core_java.oops.ExceptionTest;

public class Exception3 {

	public static void main(String[] args) {
		try
		{
			int a=10/1;
			try
			{
				int b=20/1;
			}
		catch(Exception e)
			{
				System.out.println("a=5");
			}
		}
			catch(Exception e)
			{
				System.out.println("b=20");
			}
		//System.out.println("b=10");
		
     	}
	
}