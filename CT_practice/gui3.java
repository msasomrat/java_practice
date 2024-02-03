import javax.swing.*;
import java.awt.*;

public class gui3 extends JFrame {
    public gui3() {
        // Default Layout
        setLayout(new FlowLayout()); // Flow Layout is default for JFrame

        // Components
        JLabel label = new JLabel("Label:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");

        // Adding components to the frame
        add(label);
        add(textField);
        add(button);

        setTitle("Default Layout");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        gui3 frame = new gui3();
        frame.setVisible(true);
    }
}
