//package java_gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class red_green extends JFrame{
    private Container c;
    private JButton button1, button2, button3;


    red_green()
    {
        c= this.getContentPane();
        c.setLayout(null);
        setTitle("Color Changing");
        setBounds(10, 10, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button1 = new JButton();
        button1.setBounds(50, 30, 60, 30);
        button1.setText("Red");
        c.add(button1);

        button2 = new JButton();
        button2.setBounds(120, 30, 80, 30);
        button2.setText("Green");
        c.add(button2);

        button3 = new JButton();
        button3.setBounds(210, 30, 80, 30);
        button3.setText("Yellow");
        c.add(button3);
        colour_listener listener_whom = new colour_listener();
        button1.addActionListener(listener_whom);
        button2.addActionListener(listener_whom);
        button3.addActionListener(listener_whom);
    }

    class colour_listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()== button1) {
                c.setBackground(Color.RED);
            }
            else if (e.getSource() == button2) {
                c.setBackground(Color.GREEN);
            }
            else if (e.getSource() == button3) {
                c.setBackground(Color.YELLOW);
            }
        }
    }

    public static void main(String[] args)
    {
        red_green frame = new red_green();

        frame.setVisible(true);
    }
}
