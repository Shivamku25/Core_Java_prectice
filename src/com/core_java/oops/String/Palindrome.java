package com.core_java.oops.String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = x.nextLine();
		char a1[] = s1.toCharArray();
		int j = s1.length() - 1;
		int k = 0;
		for (int i = 0; i < j; i++) {
			if (a1[i] != a1[j]) {
				k = 1;
				break;
			}
			j--;
		}
		if (k == 1)
			System.out.println("not palindrome");
		else
		System.out.println("palindrome");
	}

}
