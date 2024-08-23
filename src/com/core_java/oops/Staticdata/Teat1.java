package com.core_java.oops.Staticdata;

public class Teat1 {
	static int a = 5;
	static int b = 10;//class member or static data member
	int c;//instance member 

	public static void main(String[] args) {

		Teat1 x1 = new Teat1();
		Teat1 x2 = new Teat1();
		System.out.println(" " + x1.a);
		System.out.println(" " + x2.b);
		System.out.println(" " + x2.c);

	}
}
