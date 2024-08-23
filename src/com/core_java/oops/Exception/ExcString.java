package com.core_java.oops.Exception;

public class ExcString {
    public static void main(String args[]) {
        try {
            String word = "My Name is Prithvi";
            System.out.println(word.charAt(18));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out of limits");
        }
    }
}
