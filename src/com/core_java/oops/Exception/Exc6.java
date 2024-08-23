package com.core_java.oops.Exception;

public class Exc6 {
	    public static void main(String[] args) 
	    {
	        try
	        {
	            // Creating an object of ArithmeticException
	            ArithmeticException ae = new ArithmeticException();
	            //Manually throwing ArithmeticException
	            throw ae;
	            
	        }
	       

	        catch (ArithmeticException e)
	        {
	            System.out.println("Rethrowing the caught exception below "); 
	            //Rethrowing ArithmeticException 
	            System.out.println("Ankit");
	            System.out.println(e);
	            
	            throw e;
	           	        }
	    }
	}


