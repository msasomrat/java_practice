import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui8 {
    public static void main(String[] args) {
        
            JFrame frame = new JFrame("Temperature Converter");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());

            JLabel fahrenheitLabel = new JLabel("Temperature in Fahrenheit");
            JTextField fahrenheitTextField = new JTextField(10);

            JLabel celsiusLabel = new JLabel("Temperature in Celsius:");
            JTextField celsiusTextField = new JTextField(10);
            celsiusTextField.setEditable(false); // Make it read-only

            JButton convertButton = new JButton("Convert");
            convertButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        // Get the input Fahrenheit value
                        double fahrenheit = Double.parseDouble(fahrenheitTextField.getText());

                        // Convert Fahrenheit to Celsius
                        double celsius = (fahrenheit - 32) * 5 / 9;

                        // Display the result in the Celsius text field
                        celsiusTextField.setText(String.format("%.2f", celsius));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid number.");
                    }
                }
            });

            panel.add(fahrenheitLabel);
            panel.add(fahrenheitTextField);
            panel.add(celsiusLabel);
            panel.add(celsiusTextField);
            panel.add(convertButton);

            frame.add(panel);
            frame.setVisible(true);
        
    }
}
