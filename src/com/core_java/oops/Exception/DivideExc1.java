package com.core_java.oops.Exception;

public class DivideExc1 {
		public static int divide(int x,int y)
		{
		try
		{
		return x/y;
		}
		
		catch (ArithmeticException e)
		{
		System.out.println("ArithmeticExceptioncaugh in divide,rethrowing...... ");
		throw(e);
		}
		}
		public static void main(String[] args) {
		try
		{
		int a = Integer.parseInt(args [0]);
		int b =Integer.parseInt(args [1]);
		int c = divide (a,b);
		System.out.println("Result is="+c);
		}
		catch(Exception e)
		{
		System.out.println("Raushan Ranjan");
		System.out.println(e);
		}
		}
		

}
