public class prog2 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e2) {
            System.out.println("Exception in subclass -> " + e2);
        } catch (Exception e) {
            System.out.println("Exception in superclass -> " + e);
        } finally {
            System.out.println("Finally Block -> this block always executes even after error.");
        }
    }
}
