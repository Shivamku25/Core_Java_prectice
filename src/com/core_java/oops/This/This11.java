package com.core_java.oops.This;

import java.util.Scanner;
class C1
{
	int a,b;
	protected void get()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two number :- ");
		a=in.nextInt();
		b=in.nextInt();
	
	}
	protected void add()
	{
		System.out.println("Addition of two number = " +(a+b));
	}
}
class P1 extends C1
{
	protected void sub()
	{
		System.out.println("Substraction is = " +(a-b));
	}
}
public class This11 {
	public static void main(String[] args) {
		P1 x1 = new P1();
		x1.get();
		x1.add();
		x1.sub();
	}

}
