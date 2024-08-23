package com.core_java.oops.Inheritance;

class S1
{
	public void show()
	{
		System.out.println("One Parameter");
	}
}

  class Q1 extends S1 {
	public void show() 
	
	{
		super.show();
		//this.show();
		System.out.println("Default Constructor");
	}
  }
  public class Inheritance1
  {
	  
	public static void main(String[] args) {
		
		S1 x1 = new Q1();
		x1.show();
	}
}
