package Operator_Assignments;

public class Floating_Point_Arthmetic {
    public static void main(String[] args) {
        System.out.println(10/0.0); // O/P : Infinity
        System.out.println(-10/0.0); // O/P : -Infinity
        System.out.println(0.0/0); // O/P : NaN (Not a Number).
        System.out.println(Float.isNaN(Float.NaN));// Check if NaN is NaN
    }
}
