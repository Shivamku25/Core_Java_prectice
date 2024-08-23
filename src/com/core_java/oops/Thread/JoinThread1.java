package com.core_java.oops.Thread; // Package name should be lowercase

import java.util.concurrent.ExecutionException; // Correct import for ExecutionException

public class JoinThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) { // Catch InterruptedException
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JoinThread1 t1 = new JoinThread1();
        JoinThread1 t2 = new JoinThread1();
        JoinThread1 t3 = new JoinThread1();

        t1.start();

        try {
            t1.join(2000); // Join with 2000 millisecond timeout
        } catch (InterruptedException e) { // Catch InterruptedException
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}
