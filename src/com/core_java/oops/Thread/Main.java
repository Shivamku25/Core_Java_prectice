package com.core_java.oops.Thread;

class  Hello extends Thread {
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println("Abhinav");
        }
    }
}
class Hi extends Thread{
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println("Khushi");
        }
    }
}
public class Main {
    public static void main(String[] args) {
    	Hi t2 = new Hi();
        Hello t1 = new Hello();
        t2.start();
        t1.start();
        
    }
}