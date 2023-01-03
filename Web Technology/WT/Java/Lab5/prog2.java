import java.util.Scanner;

public class prog2 {
    public static void main(String args[]) {
        Rectangle rc = new Rectangle();
        rc.readData();
        rc.calculate();
        rc.displayData();
    }
}

class Rectangle {
    Scanner sc = new Scanner(System.in);
    private float l, b, area, per;

    Rectangle() {
        l = b = area = per = 0;
    }

    void readData() {
        System.out.print("Enter length: ");
        l = sc.nextInt();
        System.out.print("Enter breadth: ");
        b = sc.nextInt();
    }

    void calculate() {
        area = l * b;
        per = 2 * (l + b);
    }

    void displayData() {
        System.out.println("Length = " + l);
        System.out.println("Breadth = " + b);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + per);
    }
}
