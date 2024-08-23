package com.core_java.oops.This;

public class This8 {
	public void show()
	{
		System.out.println(this);
	}
	public static void main(String[] args) {
		This8 x1 = new This8();
		System.out.println(x1);
		x1.show();
	}

}
