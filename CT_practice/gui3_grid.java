import javax.swing.*;
import java.awt.*;

public class gui3_grid extends JFrame {
    public gui3_grid() {
        // Grid Layout with 2 rows and 2 columns
        setLayout(new GridLayout());

        // Components
        JLabel label = new JLabel("Label:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");

        // Adding components to the frame
        add(label);
        add(textField);
        add(button);

        setTitle("Grid Layout");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        gui3_grid frame = new gui3_grid();
        frame.setVisible(true);
    }
}
