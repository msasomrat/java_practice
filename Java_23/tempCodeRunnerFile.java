import javax.swing.*;
import java.awt.*;
import java.awt.event. FocusListener;
import java.awt.event.FocusEvent;

public class gui3{
    public static void main(String[] args){
        JFrame frame = new JFrame("5th practice", null);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JPanel panel = new JPanel();
        //panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(200, 200));
        

        JPanel panel2 = new JPanel();
        //panel2.setBackground(Color.RED);
        panel2.setPreferredSize(new Dimension(200, 200));

        JLabel label1 = new JLabel("Radio Button");
        JRadioButton button1 = new JRadioButton("4 Slices", null, false);
        JRadioButton button2 = new JRadioButton("8 Slices", null, false);


        frame.setLayout(new BorderLayout(0, 0));
        panel.setLayout(new BorderLayout(0,0));
        panel.add(label1, BorderLayout.NORTH);
        panel.add(button1, BorderLayout.CENTER);
        panel.add(button2, BorderLayout.SOUTH);

        JLabel label2 = new JLabel("Checks Boxes", null, 0);
        JCheckBox check1 = new JCheckBox("Anchovies", null, false);
        JCheckBox check2 = new JCheckBox("Garlic", null, false);
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        panel2.add(label2, BorderLayout.NORTH);
        JPanel panel4 = new JPanel();
            panel4.setLayout(new GridLayout(4, 1));
            panel4.add(check1);
            panel4.add(check2);
            panel4.add(comboBox);

            // Add titleLabel to the NORTH region of panel2
            

            // Add the panel with checkboxes and combobox to the CENTER region of panel2
           panel2.add(panel4, BorderLayout.CENTER);
            
    
        
       

        

        frame.add(panel, BorderLayout.WEST);
        frame.add(panel2, BorderLayout.EAST);

        frame.setVisible(true);

    }
}