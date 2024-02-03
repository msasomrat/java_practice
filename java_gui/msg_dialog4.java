package java_gui;

import javax.swing.JOptionPane;

public class msg_dialog4 {
    public static void main(String[] args) {
        String f_name = JOptionPane.showInputDialog(null, "Enter your first name", "Title name", JOptionPane.QUESTION_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null, "Enter your last name", "Sur name", JOptionPane.QUESTION_MESSAGE);
        
        String name = f_name+" "+l_name;
        JOptionPane.showMessageDialog(null, "Your Full name "+ name);
    }
}
