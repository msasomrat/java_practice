import javax.swing.*;
import javax.swing.plaf.basic.DefaultMenuLayout;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.concurrent.Flow;

public class gui1 {
    public static void main(String[] args){
        JFrame frame = new JFrame("My Frame");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //frame.setLayout(new BorderLayout());
        JLabel label = new JLabel("Label: ");
        JTextField textField = new JTextField(null, "Text", 20);
        
        textField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                textField.setText("");
            }

            public void focusLost(FocusEvent e) {
                // Optionally handle focus lost event
            }
        });
        JButton button = new JButton("Button");
        

        frame.add(label);
        frame.add(textField);
        //frame.add(button);
        frame.setVisible(true);
        

        JFrame frame1 = new JFrame("Click to Close This");
        frame1.setSize(300, 400);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setVisible(true);
        
    }
}
