package com.core_java.oops.Array;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int i, j, n, k;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of elements :");
		n = input.nextInt();

		int a1[] = new int[n];

		System.out.println("Enter " + n + " element: ");

		for (i = 0; i < n; i++)
			a1[i] = input.nextInt();

		for (i = 0; i < (n - 1); i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (a1[j] > a1[j + 1]) {
					k = a1[j];
					a1[j] = a1[j + 1];
					a1[j + 1] = k;
				}
			}
		}

		System.out.println("Sorted list :");

		for (i = 0; i < n; i++)

			System.out.println(a1[i]);
	}
}