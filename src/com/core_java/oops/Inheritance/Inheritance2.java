package com.core_java.oops.Inheritance;

class R 
{
	int x=20;
	void m1()
			{
		System.out.println(x);
			}
		
}
class G extends R
{
	int y=30;
	void m1()
	{
		super.m1();
		//super.x = super.x+1;
		System.out.println(super.x+ " "+y);
	}
}
public class Inheritance2 {
	public static void main(String[] args) {
		R x1 = new G();
		x1.m1();
	}

}
