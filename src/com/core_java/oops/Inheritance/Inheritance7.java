package com.core_java.oops.Inheritance;

class P
{
	  private int x = 20;
	  public P() {
		  System.out.println(x);
		  
	  }
	void m1()
	{
		System.out.println(x);
	}
}
class Q extends P
{
	void m1()
	{
		super.m1();
		System.out.println("Jay Hind ");
	}
}
public class Inheritance7 
{
	public static void main(String[] args) {
		P x1 = new Q();
		x1.m1();
	}

}
