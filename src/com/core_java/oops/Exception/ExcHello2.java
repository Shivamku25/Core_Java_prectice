package com.core_java.oops.Exception;


	class ExcHello2{
		  public static void main(String args[]){
		    try{
		      int num = Integer.parseInt("9A");
		      System.out.println(num);
		    }
		    catch(NumberFormatException e){
		      System.out.println("INVALID NUMBER FORMAT");
		    }
		  }
	}
		
