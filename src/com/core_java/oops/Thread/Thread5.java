package com.core_java.oops.Thread;

public class Thread5 {
	static Thread t1;
	static 
	{
		t1=Thread.currentThread();
		System.out.println("Name of current Thread "+t1.getName());
		System.out.println("priority of current thread "+t1.getPriority());
		try
		{
			System.out.println("Going to suspended");
			Thread.sleep(1000);
			t1.setName("Bharat");
			t1.setPriority(8);
		
		}catch(Exception e)
		{
			
		}
	}
		 public static void main(String[] args)
	   {
		  System.out.println(" Name of current thread "+t1.getName()); 
		  System.out.println("priority of current thread "+t1.getPriority());
		  System.out.println("Hellow main method");
	   }
	
}
