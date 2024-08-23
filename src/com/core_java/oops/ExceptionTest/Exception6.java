package com.core_java.oops.ExceptionTest;

public class Exception6 {
	static void show()
	{
		try
		{
			System.out.print("Inside Try");
			return ;
		}
		finally
		{
			System.out.println(" Inside Finally");
		}
	}
	public static void main(String[] args) {
		show();
	}

}
