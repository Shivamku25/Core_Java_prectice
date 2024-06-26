package com.core_java.oops.Constructor;

public class Constr1 
{
    int a,b;
	public Constr1()
	{
		a=3;
		b=4;
		System.out.println("Default constructor ");
	}
	
	public Constr1(int a, int b) 
	{
		super();
		this.a = a;
		this.b = b;
		System.out.println("Two parametrize constructor ");
		//System.exit(0); 
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(b);

	}

	public static void main(String[] args) 
	{
		Constr1 x1 = new Constr1();
		x1.display();
		Constr1 x2 = new Constr1(12,10);
		x2.display();
	}

}
