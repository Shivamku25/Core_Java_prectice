package com.core_java.oops.Thread;

class U1 implements Runnable  
{
  static
   {
	 Thread t=Thread.currentThread();
	 System.out.println("name of thread -> "+t.getName());
   }
 public void run()
   {
	  Thread t=Thread.currentThread();
	  System.out.println("task1");
   }
 }
 public class DirUT1 
{
	public static void main(String[] args) 
	{
		U1 x1=new U1();
		Thread t1= new Thread(x1);
		t1.start();

	}

}