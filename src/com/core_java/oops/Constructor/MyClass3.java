package com.core_java.oops.Constructor;

public class MyClass3 {
	private int x=10;
	static int m1()
	{
		MyClass obj = new MyClass();
		int y = obj.x;
		System.out.println(y);
		return y;
	}
	public static void main(String[] args) {
		System.out.println(m1());
	}

}
