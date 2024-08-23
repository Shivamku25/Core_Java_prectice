package com.core_java.oops.Inheritance;

class A
{
    int i = 10;
}
 
class B extends A
{
    int i = 20;
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A x = new B();
 
        System.out.println(x.i);
    }
}