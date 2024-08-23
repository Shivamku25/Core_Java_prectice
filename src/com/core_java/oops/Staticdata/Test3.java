package com.core_java.oops.Staticdata;

public class Test3 {
	static {
		System.out.println("Hii");
	}

	public Test3() {
		System.out.println("Hello India");
	}

	public static void demo1()
	{
		System.out.println("Hello Shivam");
	}
	
	public static void main(String[] args) 
	{
		 Test3 x1=new Test3();  
		 x1.demo1();
		 
	}
 }

