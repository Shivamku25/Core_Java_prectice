package com.core_java.oops.Constructor;


public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Shivam";
        this.age = 21;
    }
    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old.");
    }

    public static void main(String[] args) {
        Person x1 = new Person();

        x1.sayHello();
    }
}
