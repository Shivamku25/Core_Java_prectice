package com.core_java.oops.Exception;
import java.util.Scanner;
public class Exc9 {
	    static void divide(int num1, int num2){
	        try{  
	            int result=num1/num2;  
	            System.out.println("Result after division : "+result);  
	        }  
	        catch(ArithmeticException e){
	            System.out.println("Exception while performing division : "+e.toString());
	        }  
	        finally{
	            System.out.println("I am inside finally block");
	        }  
	    }
	    
	    public static void main(String args[]){
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter number 1 : ");
	        int num1 = in.nextInt();
	        System.out.println("Enter number 2 : ");
	        int num2 = in.nextInt();
	        divide(num1,num2);
	        System.out.println("Finally block is always executed even when there is an exception");
	    }
	} 


