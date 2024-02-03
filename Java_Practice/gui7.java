import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui7{
    private JFrame frame;
    private JPanel colorPanel;

    public gui7() {
        frame = new JFrame("Color Change Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(400, 300));

        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.RED);
            }
        });

        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.GREEN);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);

        frame.add(colorPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setSize(400, 400);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new gui7();
            }
        });
    }
}