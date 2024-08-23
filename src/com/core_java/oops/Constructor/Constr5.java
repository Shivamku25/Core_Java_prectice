package com.core_java.oops.Constructor;

public class Constr5 {
	public Constr5()
	{
		System.out.println("DEfault Constructor");
	}
	public Constr5(int x,int y)
	{
		System.out.println("Parameterize Constructor");
	}
	public static void main(String[] args) {
		new Constr5();
		new Constr5(2,4);
	}

}
