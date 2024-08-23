package com.core_java.oops.Exception;

public class ExceptionHello1 {
	
	    public static void main(String[] args) {
	        int[] a = new int[5];
	        try{
	            a[4] = 7;
	            System.out.println("Sahi hai");
	            System.exit(0); 
	        }
	        catch(ArrayIndexOutOfBoundsException e){
	            System.out.print("Array index out of limits");
	        }
	    }
	}

