package com.core_java.oops.StaticMethod;

import java.util.Scanner;

public class OneToNWithoutLoop {
	static int a = 1;

	public OneToNWithoutLoop(int n) {
		if (a <= n) {
			System.out.println(a++);
			new OneToNWithoutLoop(n);
		}
	}

	public static void main(String[] args) {

		Scanner x1 = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = x1.nextInt();
		new OneToNWithoutLoop(n);

	}

}
