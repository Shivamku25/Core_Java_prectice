package com.core_java.oops.Inheritance;

class Ankit//parent class
{
	public void display()
	{
		System.out.println("Hello Ankit");
	}
}
class Aman extends Ankit//parent,child
{
	public void display()
	{
		super.display();
		System.out.println("Hello Aman");
	}
}
 class Inheritance5 extends Aman// child class
{
	public void display() 
	{
		super.display();
		System.out.println("Hello Shivam");
	}
	public static void main(String[] args) {
		Inheritance5 x1 = new Inheritance5();
		x1.display();	
	}
}



