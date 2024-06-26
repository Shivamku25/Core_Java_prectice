package com.core_java.oops.Java;

import java.util.Scanner;

public class WithoutUsingLoop1 {
	static int a=1;
	public WithoutUsingLoop1(int n)
	{
		if(a<=n)
		{
			System.out.println(a++);
			new WithoutUsingLoop1(n);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = in.nextInt();
		new WithoutUsingLoop1(n);
	}

}
