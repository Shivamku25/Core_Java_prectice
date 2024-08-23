package com.core_java.oops.ExceptionTest;

import Exception.ExcThrow;

public class Exception18 {
	public static void main(String[] args) {
		try
		{
			throw 10;
		}
		catch(Exception e)
		{
			System.out.println("Got the Exception " +e);
		}
	}

}
