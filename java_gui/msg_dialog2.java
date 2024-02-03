package java_gui;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class msg_dialog2 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("Downloads/home.png");
        JOptionPane.showMessageDialog(null, "Warning", "hey", JOptionPane.PLAIN_MESSAGE,icon);
    }
}
