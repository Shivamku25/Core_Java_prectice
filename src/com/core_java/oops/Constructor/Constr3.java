package com.core_java.oops.Constructor;


public class Constr3 
  {
	int a,b,c,d;
	{
		System.out.println("welcome");
	}
	public Constr3 ()
	{
		a=5;
		b=6;
		c=7;
		d=8;
	
	}
	public Constr3(int x,int y,int p,int q)
	{
		a=x;
		b=y;
		c=p;
		d=q;
		System.out.println("Two parameterize constructor");
	}
	
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String arg[])
	{
		Constr3 x1=new Constr3();
		    x1.display();
		Constr3 x2=new Constr3(11,22,44,55);
		   x2.display();
		Constr3 x3=new Constr3(10, 20,54,31);
		   x3.display();
		   Constr3 x4=new Constr3(15, 16,67,88);
		   x4.display();
	}
	

}