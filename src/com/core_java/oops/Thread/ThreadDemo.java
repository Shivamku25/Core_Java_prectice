package com.core_java.oops.Thread;

import java.lang.*;

public class ThreadDemo implements Runnable
{
	Thread t;
	ThreadDemo(String str)
	{
		t=new Thread (this, str);
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			if((i%5)==0)
			{
				System.out.println(Thread.currentThread()+"yielding control...");
				Thread.yield();
			}
		}
		System.out.println("Thread.currentThread().getName" + "has finished Executing");
	}

	public static void main(String[] args)
	{
		new ThreadDemo("Thread1");
		new ThreadDemo("Thread2");
		new ThreadDemo("Thread3");
	}
}