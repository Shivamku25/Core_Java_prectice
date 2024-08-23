package com.core_java.oops.Typecasting;

class  Parent{  
	   void display() {  
	      System.out.println("method of parent class");  
	   }  
	}  
	  
	class Child extends Parent {  
	   void display() {  
	      System.out.println("method of child class");  
	   }  
	}  
	class UpAndDoCasting {  
	   public static void main(String args[]) {  
	        
	      Parent obj1 = (Parent) new Child();  
	      Parent obj2 = (Parent) new Child();   
	      obj1.display();  
	      obj2.display();  
	   }  
	}  
 


