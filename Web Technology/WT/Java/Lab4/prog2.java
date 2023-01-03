public class prog2 {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            int k = Integer.parseInt(args[i]);
            if (k % 2 == 0)
                System.out.println(k + " is even!");
            else
                System.out.println(k + " is odd!");
        }
    }
}
