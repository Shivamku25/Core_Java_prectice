package com.core_java.oops.This;

public class This2 {
	int a,b;

	public This2(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public This2 swap() {
		int temp = a;
		a = b;
		b = temp;
		return this; 
	}
	public This2 display() {
		System.out.println(a);
		System.out.println(b);
		return this; 
	}


	public static void main(String[] args) {
		new This2(4, 6).display().swap().display(); 
			}
}
