public class prog1 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception -> " + e);
            System.out.println("Error occurred because string is initialized to null.");
        }
    }
}
