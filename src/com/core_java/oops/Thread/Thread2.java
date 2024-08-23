package com.core_java.oops.Thread;
import java.util.Scanner;
class UT2 extends Thread
{
	public void fact()
	{
		System.out.println("Enter any number");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		//int a=Integer.parseInt(args[0]);
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial is " +f);
	}
}
class UT3 extends Thread
{
	public void div() {
		System.out.println("Enter one number");
		Scanner in =new Scanner(System.in);
		int b=in.nextInt();
		//int b=Integer.parseInt(args[0]);
	
		if(b%3==0)
			System.out.println("Is a Factor");
		else
			System.out.println("Not a factor");
	}
}
public class Thread2 {

	public static void main(String[] args) {
	UT2 t1=new UT2();
	UT3 t2=new UT3();
        t1.fact();
        t2.div();
	}
}