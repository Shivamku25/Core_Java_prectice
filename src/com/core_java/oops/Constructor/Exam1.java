package com.core_java.oops.Constructor;

class P1
{
	public P1(int x,int y)
	{
		System.out.println("IN P1");
	}
}
class P2 extends P1
{
	public P2()
	{
		super(0,0);
		System.out.println("IN P2");
	}
}

public class Exam1 {
	public static void main(String[] args) {
		P2 x1 = new P2();
	}

}
