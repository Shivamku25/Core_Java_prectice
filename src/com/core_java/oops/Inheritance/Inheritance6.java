package com.core_java.oops.Inheritance;
class Base1
{
	public static void show()
	{
		System.out.println("Base :: show called");
	}
}
class Derived1 extends Base1
{
	
	public static void show()
	{
		System.out.println("Derived:: show called");
	}
}

public class Inheritance6 {
	public static void main(String[] args) {
		//Base1 x1 = new Derived1();
		Base1 x2 = new Base1();
		//x1.show();
		x2.show();
	}

}
