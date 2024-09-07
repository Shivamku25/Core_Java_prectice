package Operator_Assignments;

public class Equality_Operator2 {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1; // t3 references the same Thread object as t1
        Thread t = new Thread();
        Object o = new Object();
        String s = new String("patna");

        // Comparing different types of objects
        System.out.println(t == o);  // Output: false
        System.out.println(o == s);  // Output: false
        //System.out.println(s == t);  // Output: false (uncommented as needed)

        // Comparing Thread objects
        System.out.println(t1 == t2); // Output: false (different Thread objects)
        System.out.println(t1 == t3); // Output: true (same Thread object referenced)
    }
}
