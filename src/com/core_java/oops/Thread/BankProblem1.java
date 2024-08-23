package com.core_java.oops.Thread;

import java.util.Scanner;

class Peak {
    public int balance = 10000;

    public  synchronized void withdraw(int amount) {
       // System.out.println("Enter The Amount you have to Withdraw");
        if (balance < amount) {
        	System.out.println("Less Balance Please submit the balance");
            try {
                wait();
            } catch (InterruptedException e) {
            }
        } else {
        	System.out.println(" withdraw successfully");
            balance -= amount;
            System.out.println("");
        }
    }

    public synchronized void deposit(int amount) {
        System.out.println("Going to Deposit the Amount");
        this.balance += amount;
        System.out.println("Deposit of " + amount + " is Completed");
        notify();
    }
}

class User2 extends Thread {
    private Peak p;

    public User2(Peak p) {
        this.p = p;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Amount you have to Withdraw:");
        int withdrawAmount = scanner.nextInt();
        p.withdraw(withdrawAmount);
    }
}

class User3 extends Thread {
    private Peak p;

    public User3(Peak p) {
        this.p = p;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to deposit:");
        int depositAmount = scanner.nextInt();
        p.deposit(depositAmount);
    }
}

public class BankProblem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Peak p = new Peak();
        User2 t1 = new User2(p);
        User3 t2 = new User3(p);

        t1.start();
        t2.start();
    }
}
