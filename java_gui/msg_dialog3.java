package java_gui;

import javax.swing.JOptionPane;

public class msg_dialog3 {
    public static void main(String[] args) {
        String n = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,n+" Welcome");
    }
}
 