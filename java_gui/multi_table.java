package java_gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class multi_table extends JFrame {
    private Container c;
    private JLabel label, label2;
    private JTextField text;
    private JButton button;
    private ImageIcon img;
    private Font f, f2;
    private JTextArea text2;

    multi_table() {
        c = this.getContentPane();
        setBounds(200, 150, 500, 700);
        setDefaultCloseOperation(multi_table.EXIT_ON_CLOSE);
        c.setLayout(null);
        f = new Font("Arial", Font.BOLD + Font.ITALIC, 22);
        setTitle("Multiplication Table");

        c.setBackground(Color.WHITE);
        img = new ImageIcon("D:/testing/multi3.jpg");
        label = new JLabel(img);
        label.setBounds(0, 0, 500, 200);
        // label.setOpaque(true);
        // label.setBackground(Color.BLUE);
        c.add(label);

        label2 = new JLabel("Enter the number: ");
        label2.setBounds(40, 210, 200, 20);
        // label.setOpaque(true);
        // label.setBackground(Color.BLUE);
        label2.setFont(f);
        c.add(label2);
        text = new JTextField();
        text.setBounds(240, 210, 100, 30);
        c.add(text);

        button = new JButton("Clear");
        button.setBounds(240, 245, 100, 30);
        c.add(button);

        f2 = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 18);

        text2 = new JTextArea();
        text2.setBounds(40, 280, 300, 380);
        text2.setOpaque(true);
        text2.setFont(f2);
        text2.setBackground(Color.GREEN);
        c.add(text2);

        text.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = text.getText();
                if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You enter Nothing");
                } else {
                    text.setText("");
                    int num = Integer.parseInt(value);

                    for (int i = 1; i <= 10; i++) {
                        int result = num * i;
                        String r = String.valueOf(result);
                        String n = String.valueOf(i);
                        String number = String.valueOf(num);
                        text2.append(number + "X" + n + " =" + r + "\n");

                    }
                }
            }
        });

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                text2.setText("");
            }
        });

    }

    public static void main(String[] args) {
        multi_table frame = new multi_table();
        frame.setVisible(true);

    }
}
