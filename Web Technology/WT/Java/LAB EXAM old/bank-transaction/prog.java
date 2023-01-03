import java.util.*;
import java.io.*;

class LessBalanceException extends Exception {
    public String ErrorMessage() {
        return "Withdrawn Amount is not valid.";
    }
}

interface BankDetails {
    public void Creates();

    public void Deposit();

    public void Withdraw() throws LessBalanceException;

    public void Display();
}

class Bank implements BankDetails {
    public float balance_in_account;
    public String Account_no;
    public String Account_holder_name;
    Scanner sc = new Scanner(System.in);

    public void Creates() {
        System.out.print("Enter name: ");
        Account_holder_name = sc.nextLine();
        System.out.print("Enter account number: ");
        Account_no = sc.nextLine();
        balance_in_account = 0;
    }

    public void Deposit() {
        System.out.print("Enter amount to deposit: ");
        balance_in_account += sc.nextInt();
    }

    public void Withdraw() throws LessBalanceException {
        try {
            int wd;
            System.out.print("Enter amount to withdraw: ");
            wd = sc.nextInt();
            if (wd > balance_in_account) {
                throw new LessBalanceException();
            } else {
                balance_in_account -= wd;
                System.out.println("Withdraw successful!");
            }
        } catch (LessBalanceException e) {
            System.out.println(e.ErrorMessage());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void Display() {
        String s = Account_holder_name;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                str += (char) ((int) s.charAt(i) - 32);
        }
        System.out.println("Name of Account Holder: " + str);
        System.out.println("Account Number: " + Account_no);
        System.out.println("Account balance: " + balance_in_account);
    }
}

public class prog {
    public static void main(String[] args) {
        try {
            Bank obj1 = new Bank();
            Bank obj2 = new Bank();
            System.out.println("Details for bank account 1: ");
            obj1.Creates();
            obj1.Deposit();
            obj1.Display();
            obj1.Withdraw();
            System.out.println("Details for bank account 2: ");
            obj2.Creates();
            obj2.Deposit();
            obj2.Display();
            obj2.Withdraw();
        } catch (LessBalanceException e) {
            System.out.println(e.ErrorMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
