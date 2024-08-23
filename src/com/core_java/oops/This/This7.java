package com.core_java.oops.This;

public class This7 {
	int num;
	This7(int num)
	{
		this.num=num;
	}
	public void show()
	{
		System.out.println("Number : "+this.num);
	}
	This7 incr()
	{
		num++;
		return this;
	}
	public static void main(String[] args) {
		This7 x1 = new This7(20);
		x1.incr().incr();
		x1.show();
	}

}
