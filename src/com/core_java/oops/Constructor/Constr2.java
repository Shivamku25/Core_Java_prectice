package com.core_java.oops.Constructor;

class Constr2 
  {
	int a;
	int b;
	{
	
	System.out.println("Hello Shivam");
	}
	public Constr2() 
	{
		this.a = 3;
		this.b = 6;
		
		 System.out.println("Default constructor ");
	}

	public Constr2(int x, int y) 
	{
		a = x;
		b = y;
		System.out.println("Two parametrize constructor ");
	}
	public void display()
	{
		System.out.println(" "+a);
		System.out.println(" "+b);
	}
	
	public static void main(String[] args)
	{
		System.out.println("hello shivam");
		Constr2 x1 = new Constr2();
		x1.display();
		Constr2 x2 = new Constr2(10,11);
		x2.display();

	}

}
