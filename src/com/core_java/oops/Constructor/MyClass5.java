package com.core_java.oops.Constructor;


public class MyClass5 {
  int myInt;
  String myString;
  public MyClass5() {
    myInt = 0;
    myString = "default";
    System.out.println("myInt = " + myInt);
    System.out.println("myString = " + myString);
  }
  public void display() {
    System.out.println("myInt = " + myInt);
    System.out.println("myString = " + myString);
  }
  public static void main(String[] args) {
    MyClass5 obj = new MyClass5();
    obj.display();
  }
}