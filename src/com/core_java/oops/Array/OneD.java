package com.core_java.oops.Array;

import java.util.Scanner;

public class OneD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = in.nextInt();
		int[] a1 = new int[n];
		System.out.println("Enter data in array");
		for (int i = 0; i <n; i++)
			a1[i] = in.nextInt();
		System.out.println("My data in reverse order");
		for (int i = n - 1; i >= 0; i--)
			System.out.println(a1[i]);

	}

}
