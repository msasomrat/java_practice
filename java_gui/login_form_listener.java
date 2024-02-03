package java_gui;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class login_form_listener extends JFrame{
    private Container c;
    private JLabel label;
    private JTextField text;
    private JPasswordField pass;
    private JButton login, cancel;

    login_form_listener(String name)
    {
        c = this.getContentPane();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(500, 300, 500, 400);
        setTitle("Login Page");
        c.setLayout(null);

        label = new JLabel("Welcome "+ name);
        label.setBounds(200, 150, 150, 20);
        c.add(label);
    }  
    
    public static void main(String[] args) {
        
    }
}

