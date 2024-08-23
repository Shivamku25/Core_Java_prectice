package com.core_java.oops.Abstract;


abstract class Abc {
	public abstract void display();

	public void print() {
		System.out.println("Hello India");
	}
}

 class  SubC1 extends Abc {
	public void display() {
		System.out.println("Hello Patna");
    }
}

public class Abstract1 {

	public static void main(String[] args) {
		Abc x1 = new SubC1();
		x1.print();
		x1.display();
	}

}
