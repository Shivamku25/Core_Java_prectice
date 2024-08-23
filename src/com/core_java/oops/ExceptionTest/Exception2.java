package com.core_java.oops.ExceptionTest;

public class Exception2 {

	private static String sum;

	public static void main(String[] args) {
		try
		{
			int i,num,sum;
			num=10;
			for(i=-1;i<3;++i)
				sum=num/i;
		}catch(ArithmeticException e)
		{
			System.out.println("0");
		}
		System.out.println(" "+sum);
		
	}

}
