package com.core_java.oops.Exception;
import java.util.Scanner;
public class Exc4 {
	    public static void main(String[] args) 
	    {
	        /* After completion of try block,
	        the Scanner object would be auto closed
	        as Scanner class implements AutoCloseable 
	        interface. */
	        Scanner sc = new Scanner(System.in);
	        {
	            System.out.println(" try without catch/finally block ");
	        }
	    }

}
