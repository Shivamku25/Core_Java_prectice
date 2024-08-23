package com.core_java.oops.This;

public class This5 {
	public void display()
	{
		int a=9;
		int b=8;
		this.a=a;
		this.b=b;
		System.out.println(this.a);
		System.out.println(this.b);
	}
	int a,b;
	public This5(int a,int b)
	{
		System.out.println(this.a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		This5 x1 = new This5(23,34);
		x1.display();
	}

}
