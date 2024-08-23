package com.core_java.oops.Thread;

class User extends Thread
{
	public void run()
	{
		System.out.println("Shivam kumar");
	}
}

public class IndirectThread {
	public static void main(String[] args) {
		
		User x1 = new User();
		x1.start();
	}

}
