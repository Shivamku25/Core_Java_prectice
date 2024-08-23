package com.core_java.oops.Inheritance;

abstract class Abc {
	abstract void display();
}

 class Xyz extends Abc {
	public void display() {
		System.out.println("Hello shivam");
	}
}

public class AbstractCInheritance {
	public static void main(String[] args) {
		Abc x1 = new Xyz();
		x1.display();
	}
}
