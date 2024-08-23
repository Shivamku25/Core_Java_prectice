package com.core_java.oops.Wrapperclass;

import java.util.Scanner;
public class Wrap1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
    System.out.println("Addition is " +(a+b));
    System.out.println("Subtraction is " +(a-b));
    System.out.println("Multiplication is " +(a*b));
    System.out.println("Division is " +(a/b));
	}
}