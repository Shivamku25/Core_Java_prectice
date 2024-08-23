package com.core_java.oops.Staticdata;

public class MyClass2 
{
   static int x = 10;
   static int m1() {
       int y = x;
       System.out.println(y);
       return y;
    }
public static void main(String[] args) {
     m1();
   }
}