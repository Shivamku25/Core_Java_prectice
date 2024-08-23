package com.core_java.oops.Exception;

public class ExcThrow {
	 static void print(){
		    try{
		      throw new StringIndexOutOfBoundsException("10");
		    }
		    catch(Exception e){
		      System.out.println("String Index Out of limits, hence worked");
		    }
		    }
		  public static void main(String args[]){
		    print();
		  }

}
