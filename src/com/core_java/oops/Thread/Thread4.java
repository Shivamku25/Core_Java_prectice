package com.core_java.oops.Thread;

class Skype extends Thread
{
	public void run()
	{
		System.out.println("Task1");
		System.out.println("Task1");
		System.out.println("Task1");
		System.out.println("Task1");
		System.out.println("Task1");
		System.out.println("Task1");
		
	}
}
public class Thread4 {

	public static void main(String[] args) {
    Skype t1=new Skype();
          t1.start();
          
	}
}
