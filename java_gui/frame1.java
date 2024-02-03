package java_gui;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class frame1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        //frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLocationRelativeTo(null);
        //frame.setLocation(512, 350);
        //setBounds method used for both size and location
        // first two parameter for location second two for size
        frame.setBounds(600, 250, 400, 300);
        frame.setTitle("First GUI");
        frame.setResizable(false);
    }
}
