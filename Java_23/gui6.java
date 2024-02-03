import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class gui6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrame", null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
       
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(panel);

        JTextField textfield  = new JTextField(10);
        textfield.setEditable(false);

        JButton new_button = new JButton("Increment");

        new_button.addActionListener(new Increment_Button(textfield));

        


         frame.setVisible(true);

    }
}
class Increment_Button implements ActionListener
{
    private JTextField textField;
    private int count = 0;
    public Increment_Button(JTextField textField)
    {
        this.textField = textField;
    }
    public void actionPerformed(ActionEvent e)
    {
        count++;
        textField.setText(Integer.toString(count));
    }
}
