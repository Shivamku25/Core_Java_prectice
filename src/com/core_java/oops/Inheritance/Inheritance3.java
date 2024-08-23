package com.core_java.oops.Inheritance;

class X
{
	int a=20;
}
class Y extends X
{
	int a=30;
}
public class Inheritance3 {
	public static void main(String[] args) {
		Y x1=new Y();
		System.out.println(x1.a);
		X x2=new X();
		System.out.println(x2.a);
		X x3 = new Y();
		System.out.println(x3.a);
	}

}
