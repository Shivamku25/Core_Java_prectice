package com.core_java.oops.Staticdata;
public class MyClass3
{
   static int a = 20;
   static int b = 30;
   static int c = 40;
    public MyClass3() 
   {
    	System.out.println(a);
    		 a = 200;
   }
static void m1() {
      b = 300;
}
static {
	System.out.println(c);
      c = 400 ;
}
public static void main(String[] args) {
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);
     MyClass3 x1 = new MyClass3();
     x1.m1();
     m1();
   }
}