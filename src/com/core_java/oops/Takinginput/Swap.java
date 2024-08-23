package com.core_java.oops.Takinginput;

import java.util.Scanner;

public class Swap {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("Before swapping");
		System.out.println("a->" + a);
		System.out.println("b->" + b);
		System.out.println("After swapping");
		a = (a + b) - (b = a);
		System.out.println("a->" + a);
		System.out.println("b->" + b);
	}
}
