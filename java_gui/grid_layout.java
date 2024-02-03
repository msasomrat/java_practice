import javax.swing.*;
import java.awt.*;
public class grid_layout extends JFrame {

    private Container c;
    private JPanel panel1, panel2;
    private JButton button1, button2, button3, button4, button5;
    private GridLayout b;
    grid_layout()
    {
        c=this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 400, 500);
        setTitle("Border Layout");
        
        b = new GridLayout(2,2);
        c.setLayout(b);
        //we can set Hgap and Vgap ushing object of the 
        //borderlayout b
        //border layout default layout of JFrame

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");

        c.add(button1);
        //c.add(Box.createHorizontalStrut(10));
        c.add(button2);
        c.add(button3);
        c.add(button4);
        //c.add(button5);
        setResizable(true);


        
    }
    public static void main(String[] args) {
        grid_layout frame = new grid_layout();

        frame.setVisible(true);

    }
}
