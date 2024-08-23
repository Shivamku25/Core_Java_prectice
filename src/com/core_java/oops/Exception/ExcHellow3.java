package com.core_java.oops.Exception;

public class ExcHellow3 {
	    public static void main(String[] args) {
	        try{
	            int num = Integer.parseInt("9A");
	            System.out.println(num);
	        }
	            catch(NumberFormatException e){
	            System.out.println("INVALID NUMBER FORMAT");
	        }
	           catch(ArrayIndexOutOfBoundsException e){
	                System.out.println("Array index out of limits");
	        }
	       catch(ArithmeticException e){
	            System.out.println("Cant divide number by zero");
	        }
	    }
}


