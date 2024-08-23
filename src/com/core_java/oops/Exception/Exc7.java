package com.core_java.oops.Exception;

import java.util.Scanner;
public class Exc7 {
	    //Throw exception if number 1 is greater than 900
	    static int add(int num1, int num2){
	      if (num1 > 900|| num2>900){
	         throw new ArithmeticException("Num 1 is greater than 900 and hence Exception is thrown");
	      }else{
	         System.out.println("Both parameters are correct!!");
	      }
	       int result = num1+num2;
	      return result ;
	   }
	   public static void main(String args[]){
	        Scanner in = new Scanner(System.in);
	       System.out.println("Enter number 1 : ");
	       int num1 = in.nextInt();
	       System.out.println("Enter number 2 : ");
	       int num2 = in.nextInt();
	       int result=add(num1,num2);
	       System.out.println("Result is : "+result);
	   }
	}


