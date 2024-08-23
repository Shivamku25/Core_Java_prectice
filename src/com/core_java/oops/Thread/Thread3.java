package com.core_java.oops.Thread;

class Stick extends Thread
{
	public void run()
	{
		System.out.println("India");
	}
}
class Pen extends Thread
{
	public void run()
	{
		System.out.println("Hindustan");
	}
}
public class Thread3 {

	public static void main(String[] args) {
	Stick t1=new Stick();
    Pen t2=new Pen();
          t1.start();
          t2.start();
	}
}
