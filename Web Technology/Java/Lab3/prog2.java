import java.util.Scanner;

public class prog2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String fname, lname;
        System.out.print("Enter first name: ");
        fname = sc.nextLine();
        System.out.print("Enter last name: ");
        lname = sc.nextLine();
        System.out.println("Hello " + fname + " " + lname);
        sc.close();
    }
}
