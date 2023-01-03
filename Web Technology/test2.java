import java.io.*;

public class test2 {
    public static void main(String args[]) throws IOException {
        char array[] = new char[10];
        // try {
        // String name = null;
        // System.out.print(name.length());
        int c;
        // FileInputStream fi = new FileInputStream("./input.txt");
        // FileOutputStream fo = new FileOutputStream("./output.txt");
        // InputStreamReader fi = new InputStreamReader(filein);
        // OutputStreamWriter fo = new OutputStreamWriter(fileout);
        // fi.read(array);
        // fo.write(array);
        // System.out.println(fi.getChannel());
        // System.out.println(fi.getFD());
        // while ((c = fi.read()) != -1) {
        // System.out.print((char) c);
        // fo.write(c);
        // }
        // System.out.println("");
        // for (char i : array)
        // System.out.print(i);
        // System.out.println("");
        // fi.close();
        // fo.close();
        int countwords = 0, countlines = 0, countchars = 0;
        FileReader fr = new FileReader("./input.txt");
        FileWriter fw = new FileWriter("./output.txt");
        while ((c = fr.read()) != -1) {
            System.out.print((char) c);
            fw.write(c);
            if ((char) c == ' ')
                countwords++;
            if ((char) c == '\n') {
                countwords++;
                countlines++;
            }
            if ((char) c != '\n' && (char) c != ' ')
                countchars++;
        }
        countlines++;
        countwords++;
        System.out.println("");
        System.out.println("Words = " + countwords);
        System.out.println("Letters = " + countchars);
        System.out.println("Lines = " + countlines);
        fr.close();
        fw.close();
        // } catch (Exception e) {
        // System.out.println(e);
        // System.out.println(e.getStackTrace());
        // }
    }
}
