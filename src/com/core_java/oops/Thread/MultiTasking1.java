package com.core_java.oops.Thread;

class UT extends Thread
{
	public void run()
	{
		System.out.println("INDIA");
	}
}
class US1 extends Thread
{
	public void run()
	{
		System.out.println("BIHAR");
	}
}
public class MultiTasking1 {
	public static void main(String[] args) {
		UT t1 = new UT();
		US1 t2 = new US1();
		t1.start();
		t2.start();
	}

}
