package com.core_java.oops.Thread;
 class A {
    int ac_no;
    String name, type;
    float amount;

    void details(int n, String nm, String t, float a) {
        ac_no = n;
        name = nm;
        type = t;
        amount = a;
    }

    void show() {
        System.out.println(ac_no + "" + type + "" + amount);
    }

    void deposit(float a) {
        amount += a;
        System.out.println("deposit amount:" + a);
    }

    void withdraw(float a) {
        if (amount < a)
            System.out.println("insufficient balance");
        else
            amount -= a;
        System.out.println("withdraw amount:" + a);
    }

    void checkblance() {
        System.out.println("blance is:" + amount);
    }
}

  class Ankit {
    public static void main(String args[]) {
        A b = new A();
        b.details(620570, "shivam", "saving", 1000);
        b.show();
        b.deposit(1000000);
        b.checkblance();
        b.withdraw(50000);
        b.checkblance();
    }
}