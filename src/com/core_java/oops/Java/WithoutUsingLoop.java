package com.core_java.oops.Java;
import java.util.Scanner;

public class WithoutUsingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number :- ");
        int n = scanner.nextInt();

        printNumbers( 1 , n );
            }
       
    public static void printNumbers(int start, int end) 
    {
        if(start <= end) 
        {
            System.out.println(start);
            printNumbers(start + 1,end);
        }
    }
}
