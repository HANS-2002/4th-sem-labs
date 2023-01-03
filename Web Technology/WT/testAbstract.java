import java.io.*;
import java.util.*;

abstract class abs {
    abstract public void display();

    public void concrete() {
        System.out.println("CONCRETE");
    }
}

class imp extends abs {
    public void display() {
        System.out.println("ABSTRACT METHOD");
    }

    public void concrete() {
        System.out.println("CONCRETE child");
    }
}

public class testAbstract {
    public static void main(String[] args) {
        abs a = new imp();
        a.concrete();
        a.display();
        new imp().display();
        new imp().concrete();
    }
}
