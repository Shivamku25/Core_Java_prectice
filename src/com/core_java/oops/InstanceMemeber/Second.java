package com.core_java.oops.InstanceMemeber;

public class Second {
    int a, b; 

    public void add(int x, int y) {
        a = x;
        b = y;
        System.out.println("addition is " + (a + b));
    }

    public int sub() { 
        return a - b; 
    }

    public static void main(String arg[]) {
        Second o1 = new Second();
        //System.out.println("subtraction is " + o1.sub());

        Second o2 = new Second();
        o2.add(20, 1);
        System.out.println("sub is " + o2.sub());
    }
}
