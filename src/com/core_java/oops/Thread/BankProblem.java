package com.core_java.oops.Thread;


	class Mode
	{
		int a=10000;
		public synchronized void withdraw(int a)
		{
			if(this.a<a)
			{
				System.out.println("Less Amount Please Wait for Someones Deposit");
				try
				{
					wait();
				}catch(Exception e)
				{
				
				}
			}
			this.a-=a;
			System.out.println("Withdrawal is Completed");
		}
		public synchronized void deposit(int a) 
		{
			System.out.println("Going to Deposit the Amount");
			this.a+=a;
			System.out.println("Deposit is Completed");
			notify();
		}
	}
	class Customer extends Thread
	{
		Mode m;
		public Customer(Mode m)
		{
			super();
			this.m=m;
		}
		public void run()
		{
			m.withdraw(10000);
		}
	}
	class User1 extends Thread 
	{
		Mode m;
		public User1(Mode m)
		{
			this.m=m;
		}
			public void run()
			{
				m.deposit(1000);
			}
		}
	public class BankProblem {

		public static void main(String[] args) {
	Mode m=new Mode();
	Customer t1=new Customer(m);
	User1 t2=new User1(m);
	     t1.start();
	     t2.start();
			
		}
	}


