package com.core_java.oops.Exception;

import java.io.IOException;

public class ThrowsExc1 {
    void m() throws IOException {
        throw new IOException("Divide error");
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (IOException e) {  // Catch IOException instead of Exception
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        ThrowsExc1 o1 = new ThrowsExc1();
        o1.p();
        System.out.println("normal flow");
    }
}
