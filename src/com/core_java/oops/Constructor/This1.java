package com.core_java.oops.Constructor;

public class This1 {
	int a, b;

	public This1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void add() {
		System.out.println("Addition is " + (a + b));
	}
	public void sub()
	{
		System.out.println("Subtraction is "+(b - a));
	}

	public void display() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		This1 x1 = new This1(5, 9);
		x1.display();
		x1.add();
		x1.sub();
	}
}
