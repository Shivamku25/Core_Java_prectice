package com.core_java.oops.Thread;


 class UserThread extends Thread
 {
	 public UserThread(String name)
	 {
		 super(name);
	 }
	 public void run()
	 {
		 for(int i=1;i<=10;i++)
		 {
		   System.out.println(i);
		   try
		   {
			   Thread.sleep(1000);
		   }catch(Exception e)
		   {
			   System.out.println("run() is complited");
		   }
		 }
	 }
 }
 class ThreadOneToTen
 {
	 public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("main() is invoked by"+t.getName()+"Thread");
		UserThread x1 = new UserThread("myThread1");
		x1.run();
		x1.start();
		x1.start();
		for(int i=10;i>=1;i--)
		{
		   System.out.println(i);
		   try
		   {
			   Thread.sleep(1000);
		   }catch(Exception e)
		   {
			   System.out.println(e);
		   }
		}
	}
 }