package com.core_java.oops.Java;

public class Simple {
	 static int a = 1;
     static int n=5;
	 static int f=1;
	
	Simple(int n)
	{
		if(a<=5)
		{
			System.out.println(a++);
			new Simple(n);
		}
	}
	public static void main(String[] args) {
		new Simple(n);
	}
	

}
