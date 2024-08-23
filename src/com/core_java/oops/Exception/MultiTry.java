package com.core_java.oops.Exception;

public class MultiTry {
		public static void main(String[] args) {
		try {
		System.out.println("Hiii");
		//System.out.println(4/0);
		try {
		System.out.println("Going to divide");
		System.out.println(4/0);
		}catch (ArithmeticException e)
		{
		System.out.println("Divide error");
		}
		try {
		int a[]=new int [5];
		a[5]=7;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Range out");
		}
		} catch(Exception e)
		{
		System.out.println("Handled");
		}
		System.out.println("Finished");
		}
		

}
