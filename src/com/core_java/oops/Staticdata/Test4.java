package com.core_java.oops.Staticdata;

public class Test4 {
	int a;//instance member
	static int b = 5;//static data member,class member
	static //static block
	{
		System.out.println("Shivam");
	}

	public static void display()//static method
	{
		System.out.println("value is "+b);
		System.out.println("Hello");
	
	}

	public static void main(String[] args) {
		Test4 x1 = new Test4();
		x1.display();
	}

}
