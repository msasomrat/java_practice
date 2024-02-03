//package java_gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class action  extends JFrame{
    private Container c;
    private JTextField text, text2;
    action(){
        c = this.getContentPane();
        setSize(400, 300);
        setLayout(null);
        text = new JTextField();
        text.setBounds(0, 10, 100, 30);
        c.add(text);

        text2 = new JTextField();
        text2.setBounds(0, 40, 100, 30);
        c.add(text2);
        
        text.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String s = text.getText();
                if(s.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Empty");
                }
                else
                    JOptionPane.showMessageDialog(null, "Given " +s);
            }
        });

        text2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String s = text.getText();
                JOptionPane.showMessageDialog(null, "Given " +s);
            }
        });

        
    }
    public static void main(String[] args) {
        action frame = new action();
       // frame.setVisible(true);
        frame.setDefaultCloseOperation(action.EXIT_ON_CLOSE);
        frame.setTitle("ActionListerner");
        frame.setVisible(true);
    }
}
