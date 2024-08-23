package com.core_java.oops.Constructor;

class Com {
    protected int length, breadth;  // Use descriptive variable names

    public Com(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Length is: " + length);
        System.out.println("Breadth is: " + breadth);
    }
}

class Rect extends Com {
    public Rect(int length, int breadth) {
        super(length, breadth);
    }

    public int area() {
        return length * breadth;
    }
}

class Cuboid extends Com {
    private int height;

    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    @Override // Explicitly mark overriding method
    public void display() {
        super.display();
        System.out.println("Height is: " + height);
    }

    public int volume() {
        return length * breadth * height;
    }
}

public class Main { // Class name should start with uppercase
    public static void main(String[] args) {
        Rect rect = new Rect(5, 6);
        rect.display();
        System.out.println("Area is: " + rect.area());

        Cuboid cuboid = new Cuboid(4, 5, 6);
        cuboid.display();
        System.out.println("Volume is: " + cuboid.volume());
    }
}
