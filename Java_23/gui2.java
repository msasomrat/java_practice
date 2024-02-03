import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class gui2 {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Click to Close Everything");
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setLayout(new BorderLayout()); // Set BorderLayout

            JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Panel to hold components at the bottom

            JLabel label = new JLabel("Label: ");
            JTextField textField = new JTextField("Text", 20);

            textField.addFocusListener(new FocusListener() {
                public void focusGained(FocusEvent e) {
                    textField.setText("");
                }

                public void focusLost(FocusEvent e) {
                    // Optionally handle focus lost event
                }
            });

            JButton button = new JButton("Button");
            

            bottomPanel.add(label);
            bottomPanel.add(textField);
            bottomPanel.add(button);


            frame.add(bottomPanel, BorderLayout.SOUTH); // Add panel to the bottom
            JMenuBar mb = new JMenuBar();
            JMenu menu1 = new JMenu("FILE");
            JMenu menu2 = new JMenu("Help");
            
            JMenuItem openItem = new JMenuItem("Save", 0);
            JMenuItem SaveItem = new JMenuItem("Save as", 0);
            menu1.add(openItem);
            menu1.add(SaveItem);
            mb.add(menu1);
            mb.add(menu1);
            mb.add(menu2);
            frame.setJMenuBar(mb);
            

            frame.setVisible(true);
        });
    }
}
