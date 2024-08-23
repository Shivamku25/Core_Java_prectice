package com.core_java.oops.Exception;

public class ExcFinally1 {
	    public static void main(String[] args) {
	        try{
	            int num = Integer.parseInt("9/0");
	            System.out.println(num);
	        }
	        catch(Exception e) {
	        	System.out.println(e);
	        	System.out.println("All ok");
	        	
	        }
	         finally {
	            System.out.println("I WILL RUN EVEN IF PROGRAM IS NOT RUNNING");
	        }
	       
	    }
	}


