package com.core_java.oops.Staticdata;

class A2
{
	static void m1()
	{
		System.out.println("m1-a");
	}
}
public class MyClass7 extends A2 {
	static void m1()
	{
		System.out.println("m1-b");
	}
	public static void main(String[] args) {
		MyClass7 x1 = new MyClass7();
		x1.m1();
	}

}
