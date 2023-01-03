import java.util.Scanner;

interface A {
    void earnings();

    void deductions();

    void bonus();
}

abstract class Manager implements A {
    double basicSal;

    Manager(double basicSal) {
        this.basicSal = basicSal;
    }

    @Override
    public void earnings() {
        System.out.println("Earnings: Rs " + String.format("%.2f", basicSal + (basicSal * 0.95)));
    }

    @Override
    public void deductions() {
        System.out.println("Deductions: Rs " + String.format("%.2f", (basicSal * 0.12)));
    }

    abstract public void bonus();
}

class Substaff extends Manager {

    Substaff(double basicSal) {
        super(basicSal);
    }

    @Override
    public void bonus() {
        System.out.println("Bonus: Rs " + String.format("%.2f", (basicSal * 0.5)));
    }

}

public class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary of the substaff: ");
        double basic = sc.nextDouble();
        sc.close();
        Substaff S1 = new Substaff(basic);
        S1.earnings();
        S1.deductions();
        S1.bonus();
    }
}

