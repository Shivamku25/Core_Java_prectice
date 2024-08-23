package com.core_java.oops.Object;

public class ObjectDemo {
	int a, b;

	public void input(int x, int y) {
		a = x;
		b = y;

	}

	public void add() {
		System.out.println("Addition is " + (a + b));
	}

	public int sub() 
	{
		return (a-b);
	}

	public static void main(String[] args) {
		ObjectDemo x1 = new ObjectDemo();
		ObjectDemo x2 = new ObjectDemo();
		x1.input(12, 11);
		x1.add();
		System.out.println("Substraction is " + x1.sub());
		x1.input(10, 8);
		x2.sub();
		System.out.println("Substraction is " + x1.sub());

	}

}
