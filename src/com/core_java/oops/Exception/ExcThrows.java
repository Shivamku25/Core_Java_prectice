package com.core_java.oops.Exception;

public class ExcThrows {
	 static void print() throws NumberFormatException{
	        System.out.println("Function1");
	        throw new NumberFormatException("10");
	    }
	  public static void main(String args[]){
	    try{
	        print();
	    }
	    finally{
	        System.out.println("GOT THE EXCEPTION");
	    }
	  }

}
