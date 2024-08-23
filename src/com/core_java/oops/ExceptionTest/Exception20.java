package com.core_java.oops.ExceptionTest;
class Test extends Exception{
public class Exception20 {
}

	public static void main(String[] args) {
		try
		{
			throw new Test();
		}
		catch(Test t)
		{
			System.out.println("Got the test Exception");
		}
		finally
		{
			System.out.println("Inside the finally block");
		}
	

 }
}
