import java.util.Scanner;

public class prog3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type of shape: ");
        String shape = sc.nextLine();
        if (shape.equals("circle")) {
            System.out.print("Enter radius of circle: ");
            double r = sc.nextDouble(), area = 3.141 * r * r;
            System.out.println("Area of circle = " + area);
        } else if (shape.equals("square")) {
            System.out.print("Enter side of square: ");
            double a = sc.nextDouble(), area = a * a;
            System.out.println("Area of square = " + area);
        } else if (shape.equals("triangle")) {
            System.out.print("Enter height of triangle: ");
            double h = sc.nextDouble();
            System.out.print("Enter base of triangle: ");
            double b = sc.nextDouble();
            double area = 0.5 * b * h;
            System.out.println("Area of triangle = " + area);
        } else
            System.out.println("Unknown Shape!");
    }
}
