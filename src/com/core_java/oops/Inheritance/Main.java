package com.core_java.oops.Inheritance;

class M1
{
		public void add()
		{
			System.out.println("In P1");
		}
}
class P2 extends M1
{
		public void add()
		{
			super.add();
			System.out.println("In P2");
		}
}
public class Main {
	public static void main(String[] args) {
		P2 x1 = new P2();
		x1.add();
	}

}
