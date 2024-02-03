//package CT_practice;
import javax.swing.JFrame;

public class gui1 extends JFrame {
    public gui1() {
        setTitle("My First GUI Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        gui1 frame = new gui1();
        frame.setVisible(true);
    }
}

// using frame class

/*
import java.awt.Frame;

public class EmptyFrameUsingFrameClass {
    public static void main(String[] args) {
        Frame frame = new Frame("My First GUI Frame");
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
*/

//using JFrame class
/*
import javax.swing.JFrame;

public class EmptyFrameUsingJFrameClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI Frame");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

 */

