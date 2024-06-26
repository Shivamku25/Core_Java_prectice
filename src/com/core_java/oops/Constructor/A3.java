package com.core_java.oops.Constructor;

class S1
{
	public S1()
	{
		System.out.println("IN S1");
	}
}
class A2 extends S1
{	}

class A3 extends A2 {
	public A3()
	{
		System.out.println("In A3");
	}
	public static void main(String[] args) {
		 new A3();
		 new A2();
		 new S1();
	}
}
