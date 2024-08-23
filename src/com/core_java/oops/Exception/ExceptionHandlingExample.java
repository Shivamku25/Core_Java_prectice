package com.core_java.oops.Exception;

import java.io.IOException;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // code that may throw an exception
            throw new IOException("An I/O Exception occurred");
        } catch (IOException e) {
            // handle the specific exception
            System.out.println("IOException caught: " + e.getMessage());
        } catch (Exception e) {
            // handle a more general exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // optional block that executes whether an exception occurred or not
            System.out.println("This block always executes.");
        }
    }
}
