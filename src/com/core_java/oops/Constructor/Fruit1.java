package com.core_java.oops.Constructor;

class Apple1 {
	 public Apple1()
	{
		System.out.println("Apple with default constructor");
	}
	 public Apple1(int x)
	{
		 this();
		System.out.println("Apple with parametrise constructor");
	}

}
   class Fruit1 extends Apple1
{
	   public Fruit1(int x)
	   {
		   super(x);
		   System.out.println("Shivam");
	   }
	
	public static void main(String[] args) {
		Fruit1 x1= new Fruit1(10);
		
	}
}

