import java.io.*;

class filedemo {
    public static void p(String str) {
        System.out.println(str);
    }

    public static void analyze(String s) {
        File f = new File(s);
        
        if (f.exists()) {
            p(f.getName() + " is a file");
            p(f.canRead() ? " is readable" : " is not readable");
            p(f.canWrite() ? " is writable" : " is not writable");
            p("Filesize:" + f.length() + " bytes");
        }
        if (f.isDirectory()) {
            p(f.getName() + " is directory");
            p("List of files");
            String dir[] = f.list();
            for (int i = 0; i < dir.length; i++)
                p(dir[i]);
        }
    }
}

public class fileio {
    public static void main(String rr[]) throws IOException {
        filedemo fd = new filedemo();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file name:");
        String s = br.readLine();
        fd.analyze(s);
    }
}