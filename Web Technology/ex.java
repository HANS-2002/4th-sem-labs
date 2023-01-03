public class ex {
    public static void main(String args[]) {
        int count = 0;
        StringBuffer st = new StringBuffer("the earth the geoid in the world");
        String s = new String(st);
        System.out.println(s);
        String strs[] = s.split(" ");
        for (String i : strs) {
            if (i.equals("the"))
                count++;
        }
        System.out.println("Number of the -> " + count);
    }
}
