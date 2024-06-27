package com.core_java.oops.Inheritance;

interface I1
{
	public void display1();
}
interface I2
{
	public void display2();
}
class IDemo1 implements I1,I2
{
	public void display1()
	{
		System.out.println("Hello India");
	}
	public void display2()
	{
		System.out.println("Welcome To Bihar");
	}
}
public class MultipleInheritance1 {
	public static void main(String[] args) {
		IDemo1 x1 = new IDemo1();
		x1.display1();
		x1.display2();
	}

}
