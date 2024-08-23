package com.core_java.oops.Constructor;


public class Constructor5 {
	Constructor5(int i)
	{
		System.out.println("Hello");
	}
	Constructor5(long l)
	{
		System.out.println("World");
	}
  public static void main(String[] args)
  {
	  Constructor5 x1 = new Constructor5(5);
	  Constructor5 x2 = new Constructor5(5L);
	  
	  
  }
}
