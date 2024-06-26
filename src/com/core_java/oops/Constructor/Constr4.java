package com.core_java.oops.Constructor;

public class Constr4 {
	Constr4()
	{
		this(20);
		System.out.println("One");
	}
	Constr4(int i)
	{
		this(null);
		System.out.println("Two");
	}
	Constr4 (Constr4 Constructor)
	{
		System.out.println("Three");
	}
	public static void main(String[] args) {
		new Constr4();
	}

}
