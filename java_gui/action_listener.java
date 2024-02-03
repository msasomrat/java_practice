package java_gui;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class action_listener extends JFrame {
    private Container c;
    private JTextField text, text2;

    private JPasswordField pass;

    action_listener() {
        c = this.getContentPane();
        setSize(400, 300);
        setLayout(null);
        text = new JTextField();
        text.setBounds(0, 10, 100, 30);
        c.add(text);

        text2 = new JTextField();
        text2.setBounds(0, 40, 100, 30);
        c.add(text2);

        pass = new JPasswordField();
        pass.setEchoChar('*');
        pass.setBounds(0, 80, 100, 30);
        c.add(pass);

        event_handle handle = new event_handle();
        text.addActionListener(handle);
        text2.addActionListener(handle);

    }

    class event_handle implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == text) {
                String s = text.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "null");
                } else
                    JOptionPane.showMessageDialog(null, "this is " + s);
            } else {
                String s = text2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "null");
                } else
                    JOptionPane.showMessageDialog(null, "this is " + s);
            }
        }
    }

    public static void main(String[] args) {
        action_listener frame = new action_listener();
        // frame.setVisible(true);
        frame.setDefaultCloseOperation(action_listener.EXIT_ON_CLOSE);
        frame.setTitle("Hello");
        frame.setVisible(true);
    }
}
