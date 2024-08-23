package com.core_java.oops.This;

public class This6 {
	int p,q;
	public This6(int x,int y)
	{
		p=x;
		q=y;
	}
	public This6 swap()
	{
	int z=p;
		p=q;
		q=z;
		return this;
	}
	public This6 display()
	{
		System.out.println(p);
		System.out.println(q);
		return this;
	}

	public static void main(String[] args) {
		new This6(3,4).swap().display();

	}

}