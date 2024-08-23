package com.core_java.oops.Exception;

import java.util.Scanner;

public class DivideExc2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x1 = 1;
		do {
		try {
		System.out.println("Enter First number");
		int n1 = input.nextInt();
		System.out.println("Enter Second number");
		int n2 = input.nextInt();
		int Sum = n1/n2;
		System.out.println(Sum);
		x1=2;
		}
		catch(Exception e) {
			System.out.println("You cant do that");
		}
		
	}while(x1==1);
	}

}
