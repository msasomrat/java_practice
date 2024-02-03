package java_gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame4 extends JFrame{
    private Container c;
    private JLabel label, label2, label3;
    private Font f;
    private ImageIcon icon;
    private JTextField text;
    private JButton button, button2;
    private Cursor cursor;
    frame4()
    {
        setBounds(200, 200 , 500, 400);
        
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);
        
        label = new JLabel();
        label.setText("Hello World! ");
        label.setBounds(0, 0, 100,20);;
        label.setToolTipText("Hello 1");
        c.add(label);

        f= new Font("Arial", Font.ITALIC+Font.BOLD, 14);
        
        label2 = new JLabel();
        label2.setText("Hello World2! ");
        label2.setFont(f);
        label2.setOpaque(true);
        label2.setForeground(Color.CYAN);
        label2.setBackground(Color.GRAY);
        label2.setToolTipText("Hello 2");
        
        String s = label2.getToolTipText();
        System.out.println(s);
        label2.setBounds(0, 20, 100,20);;
        c.add(label2);

        cursor = new Cursor(cursor.HAND_CURSOR);

        button = new JButton("Submit");
        button.setBounds(0, 90, 100, 20);
        button.setCursor(cursor);
        c.add(button);

        button2 = new JButton("Submit");
        button2.setBounds(200, 90, 100, 20);
        c.add(button2);

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                label2.setText("");
            }
        });

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                text.setText("");
            }
        });

        //icon = new ImageIcon(getClass().getResource("rocket.png"));
        //label3 = new JLabel(icon);
        //label3.setBounds(0, 40, icon.getIconWidth(),icon.getIconHeight());
         //label3.setToolTipText("Hello 3");
        //c.add(label3);
        text = new JTextField();
        text.setBackground(Color.green);
        text.setText("Hello");
        text.setFont(f);
        text.setHorizontalAlignment(JTextField.RIGHT);
        text.setBounds(0, 50, 200, 20);

        c.add(text);
        setVisible(true);


    }
    public static void main(String[] args) {
        frame4 frame = new frame4();
        frame.setTitle("Hello World!");
    }
}
