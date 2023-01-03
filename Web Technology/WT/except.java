import java.util.*;

class InvalidMarksException extends Exception {
    InvalidMarksException() {
        System.out.println("Invalid Marks!");
    }
}

class except {
    public static void main(String[] args) throws InvalidMarksException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100)
                throw new InvalidMarksException();
            else
                System.out.println("Marks Valid!");
        } catch (InvalidMarksException e) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}