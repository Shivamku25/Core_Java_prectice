package com.core_java.oops.Constructor;

public class ThisMethod {
    int a = 3, b = 5;

    public ThisMethod() {
      
    }

    public void display() {
        int a = 10;
        System.out.println(a);      
        System.out.println(this.a); 
        System.out.println(this.b); 
    }

    public static void main(String[] args) {
        ThisMethod x1 = new ThisMethod();
        x1.display();
    }
}
