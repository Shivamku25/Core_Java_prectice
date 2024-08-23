package com.core_java.oops.Constructor;

public class MyClass2 {
	static int a = 20;
	MyClass2()
	{
		a++;
		System.out.println(a);
		
	}
	void m1()
	{
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		MyClass2 obj  =new MyClass2();
		MyClass2 obj2 =new MyClass2();
		MyClass2 obj3 =new MyClass2();
		obj3.m1();
	}

}
