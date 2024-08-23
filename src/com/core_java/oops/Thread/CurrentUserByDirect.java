package com.core_java.oops.Thread;

class Ut1 implements Runnable
{
	static
	{
		Thread t=Thread.currentThread();
		System.out.println("Name of Thread "+t.getName());
	}
	public void run()
	{
		Thread t= Thread.currentThread();
		System.out.println("Name of Thread "+t.getName());
		System.out.println("task 1");
	}
}
public class CurrentUserByDirect {
	public static void main(String[] args) {
		Ut1 x1 = new Ut1();
		Thread t1 = new Thread(x1);
		t1.start();
	}

}
