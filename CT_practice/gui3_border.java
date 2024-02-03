import javax.swing.*;
import java.awt.*;

public class gui3_border extends JFrame {
    public gui3_border() {
        // Border Layout
        setLayout(new BorderLayout());

        // Components
        JLabel label = new JLabel("Label:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");

        // Adding components to the frame
        add(label, BorderLayout.WEST);
        add(textField, BorderLayout.CENTER);
        add(button, BorderLayout.EAST);

        setTitle("Border Layout");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        gui3_border frame = new gui3_border();
        frame.setVisible(true);
    }
}
