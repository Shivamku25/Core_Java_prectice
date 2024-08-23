package com.core_java.oops.Array;

import java.util.Scanner;

class LinearSearch {
	public static void main(String args[]) {
		int i, n, s, a1[];

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n = in.nextInt();
		a1 = new int[n];

		System.out.println("Enter elements");

		for (i = 0; i < n; i++)
			a1[i] = in.nextInt();

		System.out.println("Enter value which one you find");
		s = in.nextInt();

		for (i = 0; i < n; i++) {
			if (a1[i] == s) {
				System.out.println(s + " is present at location " + (i + 1));
				break;
			}
		}
		if (i == n)

			System.out.println(s + " not present ");
	}
}
