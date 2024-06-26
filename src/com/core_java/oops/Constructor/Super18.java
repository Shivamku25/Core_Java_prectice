package com.core_java.oops.Constructor;
class Common
{
	int l,b;
	public Common(int x,int y)
	{
		l=x;
		b=y;
	}
	public void display()
	{
		System.out.println("length is"+l);
		System.out.println("breadth is"+b);
	}
}
class React extends Common
{
	public String area;
	public React(int x,int y)
	{
		super(x,y);
	}
	public int area()
	{
		return l*b;
	}
}
class Cuboid2 extends Common
{
	int h;
	 String volume;
	public Cuboid2(int x,int y,int z)
	{
		super(x,y);
		h=z;
	}
	public void display()
	{
		super.display();
		System.out.println("height is"+h);
	}
	public int volume()
	{
		return l*b*h;
	}
}
public class Super18 {

	public static void main(String[] args) {
		React x1=new React(5,6);
		x1.display();
		System.out.println("area is"+x1.area());
		Cuboid2 x2=new Cuboid2(3,4,5);
		x2.display();
		System.out.println("volume is"+x2.volume());
		
	}

}