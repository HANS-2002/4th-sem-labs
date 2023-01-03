import java.io.*;
import java.util.*;

class mom {
    void display() {
        System.out.println("MOM");
    }
}

class child extends mom {
    void display() {
        System.out.println("CHILD");
        // super.display();
    }

    void dis() {
        this.display();
        super.display();
    }
}

class grandchild extends child {
    void display() {
        System.out.println("GRANDCHILD");
        // super.display();
    }
    void dis() {
        this.display();
        super.display();
    }
}

public class test1 {

    static void swap(int a[], int i, int j) {
        int c = a[i];
        a[i] = a[j];
        a[j] = c;
    }

    public static void main(String[] args) {
        child c = new child();
        mom m = new child();
        mom realm = new mom();
        // c.display();
        c.dis();
        m = new grandchild();
        System.out.println("n");
        m.display();
        c = new grandchild();
        System.out.println("n");
        c.display();
        System.out.println("n");
        c.dis();
        // System.out.println("n");
        // realm.display();
        // int a[] = { 1, 4, 2, 6, 4 };
        // int b[] = new int[10];
        // System.out.println(b.length + " " + a.length);
        // b = a;
        // System.out.println(b.length + " " + a.length);
        // for (int i : b)
        // System.out.print(i + " ");
        // System.out.println("");
        // b = new int[10];
        // System.out.println(b.length + " " + a.length);
        // for (int i = 0; i < a.length; i++)
        // for (int j = i + 1; j < a.length; j++)
        // if (a[i] > a[j])
        // swap(a, i, j);
        // for (int i : a)
        // System.out.print(i + " ");
        // System.out.println("");
        // for (int i : b)
        // System.out.print(i + " ");
        // System.out.println("");
    }
}
