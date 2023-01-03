import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class bruh {
    public static void main(String args[]) throws IOException {
        // Creating FileInputStream object
        // File file = new File("./myfile.txt");
        // FileInputStream fis = new FileInputStream(file);
        // byte bytes[] = new byte[(int) file.length()];
        // // Reading data from the file
        // fis.read(bytes);
        // // Writing data to another file
        // File out = new File("./input.txt");
        // FileOutputStream outputStream = new FileOutputStream(out);
        // // Writing data to the file
        // outputStream.write(bytes);
        // outputStream.flush();
        // System.out.println("Data successfully written in the specified file");
        // outputStream.close();
        // fis.close();

        // PrintStream ps = new PrintStream(System.out);
        int a = 'Q';
        // ps.print("HELLO");
        // ps.println(" BITHCES");
        // ps.write(a);
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        System.out.println(s);
    }
}