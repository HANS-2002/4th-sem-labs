import java.util.*;
import java.io.*;

public class StringTest {
    public static void main(String[] args) {

        String st1 = "JAVA";
        System.out.println("At position one of st1 string is = " + st1.charAt(1));
        StringBuffer st2 = new StringBuffer("JAVA");
        System.out.println("The st2 string is = " + st2);
        StringBuffer st3 = new StringBuffer("JAVA");
        st3.insert(4, "STRING");
        System.out.println("The updated st3 string is = " + st3);
        String st4 = "JAVA";
        String st5 = "JAVA";
        System.out.println("Are references of st4 and st5 same? " + (st4 == st5));
    }
}