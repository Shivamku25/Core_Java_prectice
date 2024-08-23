package com.core_java.oops.Takinginput;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two number ");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("Addintion is " + (a + b));
		System.out.println("Enter the name");
		String s1 = in.next();
		System.out.println("Welcome " +s1);
	}
	

}
