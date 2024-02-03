import javax.swing.*;
import java.awt.*;
public class jpanel_test extends JFrame {

    private Container c;
    private JPanel panel1, panel2;
    private JButton button1, button2, button3;
    jpanel_test()
    {
        c= this.getContentPane();
        setBounds(10, 10, 500, 400);
        setTitle("JPanel");
        c.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1 = new JPanel();
        panel1.setBounds(20, 20, 200, 300);
        panel1.setBackground(Color.BLUE);
        c.add(panel1);
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");

        panel2 = new JPanel();
        panel2.setBounds(230, 20, 200, 300);
        panel2.setBackground(Color.BLUE);
        c.add(panel2);

        panel1.add(button1);
        panel1.add(button2);
        panel2.add(button3);

    }
    public static void main(String[] args) {
        jpanel_test frame = new jpanel_test();

        frame.setVisible(true);

    }
}
