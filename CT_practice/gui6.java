import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonClickListener implements ActionListener {
    private int count = 0;
    private JTextField textField;

    public ButtonClickListener(JTextField textField) {
        this.textField = textField;
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        textField.setText("Hello Java Click " + count);
    }
}

public class gui6 extends JFrame {
    private JTextField textField;

    public gui6() {
        JFrame frame = new JFrame("MyFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        textField = new JTextField("Click Check", 15);
        JButton newButton = new JButton("OK");

        ButtonClickListener listener = new ButtonClickListener(textField);
        newButton.addActionListener(listener);

        panel.add(newButton);
        panel.add(textField);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new gui6();
    }
}
