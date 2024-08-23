package com.core_java.oops.String;

class Test2 {
    public void display(String S) {
        System.out.println(S);
    }
}

public class Testing {
    public static void main(String[] args) {
        int a = 5;
        char d = 'd';
        boolean t = true;

        Test2 testObject = new Test2();
        testObject.display(Integer.toString(a));
        testObject.display(Character.toString(d));
        testObject.display(Boolean.toString(t));
    }
}
