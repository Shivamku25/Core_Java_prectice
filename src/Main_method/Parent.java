package Main_method;

public class Parent {
    public static void main(String[] args) {
        System.out.println("parent main");
    }
}

class Child extends Parent {
    public static void main(String[] args) {
        System.out.println("child main");
    }
}