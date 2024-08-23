package com.core_java.oops.Exception;

public class Finally {
public static void main(String[] args) {
try {
int a=Integer.parseInt(args [0]);
int b=Integer.parseInt(args [1]);
System.out.println(a/b);
}catch(Exception e)
{
System.out.println(e);
}finally 
{
System.out.println("Finally");
}
System.out.println("Normal flow");
}
}
