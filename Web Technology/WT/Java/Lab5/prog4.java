import java.util.Scanner;

public class prog4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = 0;
        System.out.print("Enter the elements(0 to n-1): ");
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            arr[k]++;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]!=0) {
                System.out.println("Count of " + i + " = " + arr[i]);
            }
        }
    }
}
