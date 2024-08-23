package com.core_java.oops.Exception;

public class Exc18 {
    String str = "a";  // Moved the declaration to the class level

    void A() {
        try {
            str += "b";
            B();
        } catch (Exception e) {
            str += "c";
        }
    }

    void B() throws Exception {
        try {
            str += "d";
            C();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            str += "e";
        }

        str += "f";
    }

    void C() throws Exception {
        throw new Exception();
    }

    void display() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Exc18 object = new Exc18();
        object.A();
        object.display();
    }
}
