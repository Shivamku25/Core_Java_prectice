package com.core_java.oops.Abstract;

abstract class Abs2 {
    int a;
    int b;

    public Abs2() {
        System.out.println("default constructor of Abs2");
    }

    public Abs2(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("two parameterized constructor of Abs2");
    }

    public abstract void display();

    public static void add(int x, int y) {
        System.out.println(x + y);
    }
}

class AbcC2 extends Abs2 {
    public AbcC2() {
       //super(); // Call the default constructor of Abs2 with 0 values
    }

    public AbcC2(int x, int y) {
        super(x, y);
    }

    public void display() {
        System.out.println("Hello India");
    }
}

public class TestAbs {
    public static void main(String[] args) {
        Abs2 x1 = new AbcC2();
        AbcC2 x2 = new AbcC2(44, 55);
        x1.display();
        Abs2.add(11, 22); // Call the static method using the class name
        x2.display();
    }
}