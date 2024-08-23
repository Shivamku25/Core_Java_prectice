package com.core_java.oops.Object;

public class InstanceMember {

	static int b;// class member
	int c;// instance member for individual object

	public void display() {
		System.out.println("Hello India");

	}

	public static void main(String[] args) {
		int a = 10;// local variable
		System.out.println("Locla variable " + a);
		System.out.println(" Class member " + InstanceMember.b);
		InstanceMember x1 = new InstanceMember();
		System.out.println("Instance Member " + x1.c);
		x1.display();

	}

}
