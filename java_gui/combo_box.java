//package java_gui;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class combo_box extends JFrame {
    private Container c;
    private JComboBox combo;
    private JTextField text;

    combo_box()
    {
        String[] s= {"Php", "Java","C#", "Python","C","C++"};
        c= this.getContentPane();
        c.setLayout(null);
        setBounds(5, 5, 500, 350);
        setDefaultCloseOperation(combo_box.EXIT_ON_CLOSE);
        setTitle("ComboBox");
        combo = new JComboBox(s);
        combo.setBounds(50, 50, 100, 100);
        combo.setEditable(true);
        combo.setSelectedIndex(3);
        combo.addItem("Go");

        //also we can remove item using
        //removeItem()
        c.add(combo);
        System.out.println("Total item : "+ combo.getItemCount());
        
        text = new JTextField();
        text.setBounds(200, 80, 200, 30);
        text.setBackground(Color.BLUE);
        c.add(text);
        my_listener listen_ = new my_listener();
        combo.addActionListener(listen_);

        
    }
    class my_listener implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            text.setText("You're Selected "+combo.getSelectedItem());
        }
    }
    public static void main(String[] args)
    {
        combo_box frame = new combo_box();
        frame.setVisible(true);
    }
}
