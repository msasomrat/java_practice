//package Java_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class gui6 implements ActionListener {
    private int count = 0;
    private JTextField textfield;
    public gui6(){
        JFrame frame = new JFrame("MyFrame", null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
       
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(panel);

        textfield  = new JTextField("Click Check",15);




        //textfield.setEditable(false);

        JButton new_button = new JButton("OK");
    
        new_button.addActionListener(this);

        panel.add(new_button);
        panel.add(textfield);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        count++;
        textfield.setText("Hello Java Click"+count);
    }
    public static void main(String[] args) {
        new gui6();
    }
}


