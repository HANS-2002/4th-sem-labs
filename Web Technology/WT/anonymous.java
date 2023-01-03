import java.util.*;
import java.io.*;

public class anonymous {

    public void display() {
        System.out.println("SELF");
    }

    public static void main(String args[]) {

        anonymous any = new anonymous() {
            public void display() {
                System.out.println("BRUH");
            }
        };
        any.display();
    }
}
