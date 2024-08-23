package com.core_java.oops.Staticdata;

public class Myclass {
	int a=5;
     static int x = 10;//class member

    public static int m1() {
    	int a=10;
        int y = x;
        return y;
    }
    public static void main(String[] args) {
    	int a=15;
    	System.out.println(a);
        m1();
    }
}
