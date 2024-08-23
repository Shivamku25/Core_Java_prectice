package com.core_java.oops.Thread;

class Table {
    public synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread3 extends Thread {
    Table t;

    public MyThread3(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(6);
    }
}

class MyThread4 extends Thread {
    Table t;

    public MyThread4(Table t) {
        super();
        this.t = t;
    }

    public void run() {
        t.printTable(10);
    }
}

public class MyThreadTest1 {
    public static void main(String[] args) {
        Table o1 = new Table();  // Corrected the class name to Table
        MyThread3 t1 = new MyThread3(o1);
        MyThread4 t2 = new MyThread4(o1);
        t1.start();
        t2.start();
    }
}
