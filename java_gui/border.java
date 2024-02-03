import javax.swing.*;
import java.awt.*;
public class border extends JFrame {

    private Container c;
    private JPanel panel1, panel2;
    private JButton button1, button2, button3, button4, button5;
    private BorderLayout b;
    border()
    {
        c=this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 400, 500);
        setTitle("Border Layout");
        c.setLayout(new BorderLayout(10,5));

        //we can set Hgap and Vgap ushing object of the 
        //borderlayout b
        //border layout default layout of JFrame

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");

        c.add(button1,BorderLayout.SOUTH);
        c.add(button2,BorderLayout.NORTH);
        c.add(button3,BorderLayout.EAST);
        c.add(button4,BorderLayout.WEST);
        c.add(button5,BorderLayout.CENTER);


        
    }
    public static void main(String[] args) {
        border frame = new border();

        frame.setVisible(true);

    }
}
