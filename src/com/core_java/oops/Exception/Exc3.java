package com.core_java.oops.Exception;

public class Exc3 {
		public static void main(String args[]){
		    try{
		        int a = 10;
		        int b = 2;
		        int f = a / b;
		        System.out.println(f);
		        if(f == 0){
		            throw new MyException1("Designed Exception");
		        }
		    }
		    catch(MyException1 e){
		        System.out.println(e.getMessage());
		    }
		}
		}
		class MyException1 extends Exception {
		public MyException1(String message){
		    super(message);
		    }
		}


