import java.io.*;
import java.util.*;

class NegativeAmountException extends Exception {
    NegativeAmountException() {
        System.out.println("Amount greater than balance.");
    }
}

class Bank {
    public int balance;
    private static Scanner sc = new Scanner(System.in);

    Bank() {
        balance = 0;
    }

    public void deposit() {
        System.out.print("Enter amount to deposit to Bank: ");
        balance += sc.nextInt();
        // sc.nextLine();
        System.out.println("Deposit Succesfull! Balance in Bank = " + this.balance);
    }

    public void withdraw() throws NegativeAmountException {
        System.out.print("Enter amount to withdraw from Bank: ");
        int a = sc.nextInt();
        if (a <= balance) {
            balance -= a;
            System.out.println("Deposit Succesfull! Balance in Bank = " + this.balance);
        } else {
            throw new NegativeAmountException();
        }

    }
}

public class banksys {
    public static void main(String args[]) {
        try {
            Bank bc = new Bank();
            bc.deposit();
            bc.withdraw();
        } catch (NegativeAmountException e) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
