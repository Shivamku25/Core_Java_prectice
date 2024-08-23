package com.core_java.oops.Exception;

class Base extends Exception {}
class Derived extends Base  {}
public class Exc16 {
	
	  public static void main(String args[]) {
	   // some other stuff
	   try {
	       // Some monitored code
	       throw new Derived();
	    }
	    catch(Base b)     { 
	       System.out.println("Caught base class exception"); 
	    }
	    catch(Exception d)  { 
	       System.out.println("Caught derived class exception"); 
	    }
	  }
	} 


	 
