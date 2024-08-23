package com.core_java.oops.Staticdata;

public class Test5 {
    static {
        System.out.println("A is loaded");
    }

    public Test5() {
        System.out.println("A is instantiated");
    }

    static class B {
        static int b = 5;

        static {
            System.out.println("B is loaded");
        }
    }

    static class C {
        static {
            System.out.println("C is loaded");
        }

		public static void dispaly() {
			
		}
    }

    public static void display() {
        System.out.println("C is loaded by static method");
    }

    public static void main(String[] args) {
        System.out.println("main() is invoked");
        Test5 x1 = new Test5();
        System.out.println("class B is loaded by static data member ");
        System.out.println("Value is " + B.b);
        System.out.println("Class C is called");
        C.dispaly();
        System.out.println("A is instantiated again");
        Test5 y = new Test5();
    }
}
