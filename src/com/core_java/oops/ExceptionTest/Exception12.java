package com.core_java.oops.ExceptionTest;

import javax.management.openmbean.OpenMBeanAttributeInfoSupport;

public class Exception12 {
	public static void aMethod()throws Exception
	{
		try
		{
			throw new Exception();
		}
		finally
		{
			System.out.println("Finally");
		}
	}
	public static void main(String[] args) {
		try
		{
			aMethod();
		}
		catch(Exception e)
		{
			System.out.println("Exception");		
		}
		System.out.println("Finished");
	}

}
