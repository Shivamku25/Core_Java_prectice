package com.core_java.oops.Constructor;

public class MyClass4 {

  public MyClass4() {
      System.out.println("constructor");
  }
static void m1() {
      System.out.println("static method");
}
void m2(){
      System.out.println("instance method");
}
static {
      System.out.println("static block");
}
{
      System.out.println("instance block");
}
public static void main(String[] args) 
{
    MyClass4 obj = new MyClass4();
    m1();
    obj.m2();
   }
}