package com.core_java.oops.Java;

 abstract class MyTest 
{ 
   abstract void calculate(int a, int b); 
} 
 class Addition extends MyTest 
{ 
   void calculate(int a, int b)
   { 
      int x = a + b; 
      System.out.println("Sum: " +x); 
   } 
} 
 class Subtraction extends MyTest 
{ 
   void calculate(int a, int b)
   { 
      int y = a - b; 
      System.out.println("Subtract: " +y); 
   } 
} 
 class Multiplication extends MyTest 
{ 
   void calculate(int a, int b)
   { 
      int z = a * b; 
      System.out.println("Multiply: " +z); 
   } 
} 
 class Division extends MyTest
{
	void calculate(int a,int b)
	{
		int e = a / b;
		System.out.println("Division :" +e);
	}
}
public class Abstract3 { 
public static void main(String[] args) 
{ 
 
    Addition a = new Addition(); 
    Subtraction s = new Subtraction(); 
    Multiplication m = new Multiplication();
    Division d = new Division();
    
 
    a.calculate(20, 30); 
    s.calculate(10, 5); 
    m.calculate(10, 20); 
    d.calculate(30, 15);
    
 } 
}