package com.core_java.oops.Staticdata;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MyClass5 {
	  static int a = 20;//class member
	  static  //static block
	  {
	        a++;
	        System.out.println(a);
	  }
	  static {
	       a++;
	        System.out.println(a);
	  }
	   
	  
		//public MyClass5()
	  
		{
	    a++;
	    System.out.println(a);
		}
		 static void dispaly()//static method
		{
			System.out.println("Shivam");
		}
		 MyClass5() {
			 
			System.out.println(a);
			System.out.println("Shivam");
		
  }
	  
	public static void main(String[] args) 
	{
	   MyClass5 obj =  new MyClass5();
	   MyClass5 obj2 = new MyClass5();
	   obj2.dispaly();
	   //MyClass5 obj3 = new MyClass5();
	   //MyClass5 obj4 = new MyClass5();
	  
	   
	
	  }

	}