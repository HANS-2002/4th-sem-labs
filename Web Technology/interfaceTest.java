import java.io.*;
import java.util.*;

interface InfaceA {
    public void showA();

    default public void display() {
        System.out.println("Good morning to everyone");
    }
}

interface InfaceB extends InfaceA {
    public void showB();

    default public void display() {
        System.out.println("Good bye to everyone");
    }
}

// class mom {
//     void display() {
//         System.out.println("MOM");
//     }
// }

// class child extends mom {
//     void display() {
//         System.out.println("Child");
//     }
// }

// interface superinter {
//     // default void dis() {
//     // System.out.println("Interface IMPLEMENT");
//     // }
//     void dis();
// }

// interface inter extends superinter {

//     default void display() {
//         System.out.println("Interface");
//     }
// }

// class imp implements inter {
//     void dis() {
//         System.out.println("IMPLEMENT");
//     }
//     // void display() {
//     // System.out.println("IMP");
//     // }
// }

public class interfaceTest implements InfaceB {
    public static void main(String[] args) {

        // imp a = new imp();
        // a.display();
        // a.dis();
        public void showA() {
            System.out.println("It is Interface A");
        }

        void showB() {
            System.out.println("It is Interface B");
        }
        interfaceTest d = new interfaceTest();
        d.showA();d.showB();
    }
}
