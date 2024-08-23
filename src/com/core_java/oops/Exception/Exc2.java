package com.core_java.oops.Exception;

public class Exc2 {

	public static void main(String[] args) {
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(a/b);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Normal Flow");

	}

}
