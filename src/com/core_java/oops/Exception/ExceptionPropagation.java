package com.core_java.oops.Exception;

public class ExceptionPropagation {
    public static final String[] args = null;

	void m() {
		
		//int a1 = Integer.parseInt(args[0]);
    	//int a2 = Integer.parseInt(args[1]);
        int c = (10/2);
    }


	void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.p();
        System.out.println("Normal flow");
    }
}
