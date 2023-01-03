import java.awt.*;
import java.applet.*;

public class applet
        extends Applet {

    public void init() {
        System.out.println("INIT");
    }

    public void start() {
        System.out.println("START");
    }

    public void paint(Graphics g) {
        // g.drawString("DISPLAYING A SIMPLE MESSAGE", 50, 50);
        System.out.println("PAINT");
    }

    public void stop() {
        System.out.println("STOP");
    }

    public void destroy() {
        System.out.println("DESTROY");
    }
}
