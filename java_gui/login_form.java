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

public class login_form extends JFrame{
    private Container c;
    private JLabel username, password;
    //here JTextField single line but JTextArea multiline
    // private JTextArea text_area
    private JTextField text;
    private JPasswordField pass;
    private JButton login, cancel;

    login_form()
    {
        c = this.getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 500, 400);
        setTitle("Hello");
        c.setLayout(null);
        username = new JLabel("Username: ");
        username.setBounds(30, 40, 100, 20);
        password = new JLabel("Password: ");
        password.setBounds(30, 60, 100, 20);
        c.add(username);
        c.add(password);

        text = new JTextField();
        text.setBounds(100, 40, 200, 20);
        c.add(text);

        pass = new JPasswordField();
        pass.setBounds(100, 60, 200, 20);
        c.add(pass);

        login = new JButton("Login");
        login.setBounds(100, 90, 80, 20);
        c.add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(220, 90, 80, 20);
        c.add(cancel);


        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                text.setText("");
                pass.setText("");
            }
        });

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String s = text.getText();
                String s2 = pass.getText();
                if (s2.equals("hello")) {
                    JOptionPane.showMessageDialog(null, "Hello "+ s );
                    
                    login_form_listener listener = new login_form_listener(s);
                    
                    listener.setVisible(true);

                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong Password" );
                }
            }
        });



    }
    public static void main(String[] args) {
        login_form frame = new login_form();

        frame.setVisible(true);
    }
}
