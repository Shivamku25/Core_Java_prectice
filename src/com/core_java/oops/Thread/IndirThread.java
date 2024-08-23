package com.core_java.oops.Thread;

class Uf1 extends Thread {
    public void run() {
        System.out.println("Task Completed");
    }
}

public class IndirThread {
    public static void main(String[] args) {
        Uf1 t1 = new Uf1();
        t1.start();
    }
}
