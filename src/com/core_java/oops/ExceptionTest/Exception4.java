package com.core_java.oops.ExceptionTest;

public class Exception4 {
	void show(int a)throws MyException
	{
	   System.out.println("Hello Custom Exception");
	   int b = a/0;
	}
	public static void main(String[] args)
	{
		Exception4 obj = new Exception4();
		try {
			obj.show(5);
		} catch (Exception e) {
			System.out.println("Shivam");
		}
		System.out.println("Bye Custom Exception");
	}

}
class MyException extends Exception
{
	MyException(){
		super();
	}
		MyException(String name)
		{
			super(name);
		}
		
}
