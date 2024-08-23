package com.core_java.oops.Array;

import java.util.Scanner;

public class TwoD {

	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter row and col number");
		int r = in.nextInt();
		int c = in.nextInt();
		int[][] M1 = new int[r][c];
		System.out.println("Enter data in matrix");
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				M1[i][j] = in.nextInt();
		System.out.println("Hello my matrix");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print("\t" + M1[i][j]);
			}
			System.out.println();
		}
	}

}
