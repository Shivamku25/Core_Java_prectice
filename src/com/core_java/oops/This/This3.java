package com.core_java.oops.This;



public class This3 
{
    int a,b;
	public This3 ()
	{
		this(7,8);
		System.out.println("Default constructor ");
	}
	
	public This3 (int x) 
	{
		this(x,10);
		System.out.println("one parametrize constructor ");
	}
	public This3(int x,int y)
	{
	   a=x;
	   b=y;
		System.out.println("Two parametrize constructor");
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(b);

	}

	public static void main(String[] args) 
	{
		This3 x1 = new This3();
		x1.display();
		This3 x2 = new This3(9);
		x2.display();
		This3 x3 = new This3(11,12);
		x3.display();
	}

}
