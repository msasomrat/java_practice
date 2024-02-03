package java_gui;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class check_box extends JFrame{
    private Container c;
    private JCheckBox button, button2;
    private ButtonGroup group;
    private JTextArea text;

    check_box()
    {
        c = this.getContentPane();
        c.setLayout(null);
        setDefaultCloseOperation(radio_button.EXIT_ON_CLOSE);
        setBounds(10, 10, 500, 400);
        button = new JCheckBox("class");
        button.setBounds(30,80, 60,20);
        button.setBackground(Color.GREEN);

        //we can internally select a button when program start
        // by setSelected
        // we can also disable a button
        //by using setEnable
        //button.setEnabled(false);
        //button.setSelected(true);
        c.add(button);
        group = new ButtonGroup();

         button2 = new JCheckBox("Resident");
        button2.setBounds(200,80, 100,20);
        
        c.add(button2);

        text = new JTextArea();
        text.setBounds(10, 100, 400, 400);
        c.add(text);
        //if we add more than one buttoon then we cant 
        //select more than one at a time
        group.add(button);
        group.add(button2);
        
        my_listener listen= new my_listener();
        button.addActionListener(listen);
        button2.addActionListener(listen);
       
        
    }
     class my_listener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource()== button && button.isSelected()) {
                    text.setText("your selected class"+"\n");
                }
                else{
                    text.setText("your selected resident"+"\n");
                }
            }
        }
    public static void main(String[] args)
    {
        check_box frame = new check_box();
        frame.setVisible(true);

    }
}
