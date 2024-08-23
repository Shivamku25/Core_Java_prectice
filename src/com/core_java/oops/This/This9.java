package com.core_java.oops.This;

public class This9 {
	void m1(This9 t)
	{
		System.out.println("m1 method is called");
	}
	void m2()
	{
		m1(this);
	}
	public static void main(String[] args) {
		This9 x1 = new This9();
		x1.m2();
	}

}
