import javax.swing.*;
import java.awt.*;

public class gui3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("5th practice");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(200, 200));
        JLabel label1 = new JLabel("Radio Button");
        JRadioButton button1 = new JRadioButton("4 Slices", null, false);
        JRadioButton button2 = new JRadioButton("8 Slices", null, false);
        leftPanel.setLayout(new BorderLayout(0, 0));
        leftPanel.add(label1, BorderLayout.NORTH);
        leftPanel.add(button1, BorderLayout.CENTER);
        leftPanel.add(button2, BorderLayout.SOUTH);

        JPanel rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(200, 200));
        JLabel label2 = new JLabel("Checkboxes");
        JCheckBox check1 = new JCheckBox("Anchovies", null, false);
        JCheckBox check2 = new JCheckBox("Garlic", null, false);
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);

        rightPanel.setLayout(new BorderLayout());
        JPanel checkboxPanel = new JPanel();
        checkboxPanel.setLayout(new GridLayout(2, 1));
        checkboxPanel.add(check1);
        checkboxPanel.add(check2);
        rightPanel.add(label2, BorderLayout.NORTH);
        rightPanel.add(checkboxPanel, BorderLayout.CENTER);
        rightPanel.add(comboBox, BorderLayout.SOUTH);

        frame.setLayout(new BorderLayout());
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);

        frame.setVisible(true);
    }
}
