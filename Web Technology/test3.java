import java.lang.*;
import java.util.*;

public class test3 {
    public static void main(String[] args) {
        try {
            String strx = "abcd"; // object stored in pool
            String stry = "abcd"; // only one "abcd" exists in pool
            String strz = new String("abcd"); // new object
            String str1 = new String("abcd"); // new object
            String s2 = new String(); // empty string
            String s1 = "";
            // empty string
            System.out.println("Are references of strx and stry same?" + (strx == stry));
            System.out.println("Are references of strx and strz same?" + (strx == strz));
            System.out.println("Are references of str1 and strz same?" + (str1 == strz));
            System.out.println("Are references of s1 and s2 same? " + (s1 == s2));
            System.out.println("Are strx and strz equal?" + strx.equals(strz));

            byte[] arr = { 65, 66, 67, 68, 69 };
            byte[] uray = { '\u0041', '\uu0042', '\u0043' };
            String arrStr = new String(arr, 0, 5, "ascii");
            String uStr = new String(uray, "utf-8");
            System.out.println(arrStr);
            System.out.println(uStr);

            String org = "   MY name is HANS  ";
            String rep = "MAYA";
            System.out.println("Original -> " + org);
            org = org.replace("HANS", rep);
            org = org.trim();
            System.out.println("Original -> " + org);

            StringBuffer st = new StringBuffer("HEYO");
            st.replace(0, 4, "BRUH");
            st.reverse();
            System.out.println(st);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}