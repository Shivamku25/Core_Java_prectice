package com.core_java.oops.Thread;

class Table1 {
    public void printTable(int n) {
        synchronized (this) {
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
}

class MyTh1 extends Thread {
    Table1 t;

    public MyTh1(Table1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(6);
    }
}

class MyTh2 extends Thread {
    Table1 t;

    public MyTh2(Table1 t) {
        super();
        this.t = t;
    }

    public void run() {
        t.printTable(10);
    }
}

public class MyThreadTest2 {
    public static void main(String[] args) {
        Table1 o1 = new Table1();
        MyTh1 t1 = new MyTh1(o1);
        MyTh2 t2 = new MyTh2(o1);
        t1.start();
        t2.start();
    }
}
