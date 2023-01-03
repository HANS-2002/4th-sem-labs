import java.io.*;
import java.util.*;

abstract class Shape {
    abstract void draw(); // abstract method declared
}

class Square extends Shape { // subclass declaration
    void draw() {
        System.out.println("Square is drawn");
    }
}

class Triangle extends Shape { // subclass declaration
    void draw() {
        System.out.println("Triangle is drawn");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("FInalised");
    }
}

class testClass {
    void display() {
        System.out.println("Static Shit");
    }
}

class Dem {
    public static void display() {
    }
}

// public class test extends Dem {
// public static void display() {
// System.out.println("Hello this is a static method");
// }

// static class bruhClass {
// public void dis() {
// System.out.println("Hello this is a static method for bruhClass");
// }
// }

// public static void main(String args[]) throws Exception {
// display();
// new bruhClass().dis();
// }
// }

public class test {

    protected void finalize() throws Throwable {
        try {
            System.out.println("inside demo's finalize()");
        } catch (Throwable e) {

            throw e;
        } finally {
            System.out.println("Calling finalize method"
                    + " of the Object class");
            // Calling finalize() of Object class
            super.finalize();
        }
    }

    // Driver code
    public static void main(String[] args) throws Throwable {

        // Creating demo's object
        test d = new test();

        // Calling finalize of demo
        d.finalize();
    }
    // public static void main(String[] args) {
    // new testClass().display();

    // }
}
