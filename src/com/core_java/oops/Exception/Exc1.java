package com.core_java.oops.Exception;

public class Exc1 {

	public static void main(String[] args) {
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     try {
    	 System.out.println(a/b);
     }catch (ArithmeticException e)
     {
    	 System.out.println(e);
     }
     System.out.println("Normal Flow");
     
	}

}
