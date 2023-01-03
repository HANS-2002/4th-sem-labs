import java.util.Scanner;

class NegativeNumberException extends Exception {
    public String ProcessInput() {
        return "Negative Number Exception.";
    }
}

public class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        try {
            if (num < 0) {
                throw new NegativeNumberException();
            } else {
                System.out.println("Number = " + num);
            }
        } catch (NegativeNumberException ex) {
            String str = ex.ProcessInput();
            System.out.println(str);
        }
    }
}
