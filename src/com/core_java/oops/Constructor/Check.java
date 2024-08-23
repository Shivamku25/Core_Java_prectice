package com.core_java.oops.Constructor;
 
class C1
{
	int x=50;
}
class C2 extends C1
{
	int x=100;
}
public class Check {
	public static void main(String[] args) {
		C2 x1 = new C2();
		System.out.println("x1.x");
		C1 x2 = new C1();
		System.out.println(x2.x);
		C1 x3 = new C1();
		System.out.println("x3.x");
	}

}
