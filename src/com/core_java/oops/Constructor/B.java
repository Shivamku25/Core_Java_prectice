package com.core_java.oops.Constructor;

  class Exam {
    public void m1() {
        System.out.println("m1 in Exam");
    }
}
  public class B extends Exam {
    public void m1() {
        System.out.println("m1 in B");
    }
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        Exam p = new Exam();
        p.m1();
        Exam a2 = new Exam();
        a2.m1();
    }
}
