//package java_gui;

import javax.swing.*;

public class frame3 extends JFrame{
    private ImageIcon icon;
    frame3()
    {
         //frame3 frame = new frame3();
        setVisible(true);
        setDefaultCloseOperation(frame3.EXIT_ON_CLOSE);
        setBounds(350, 200, 400, 300);
        setTitle("Icon Changing");
        frame3_op();
    }
    public void frame3_op()
    {
        icon = new ImageIcon(getClass().getResource("rocket.png"));
        this.setIconImage(icon.getImage());
    }
    public static void main(String[] args) {
        frame3 frame = new frame3();
        // frame.setVisible(true);
        // frame.setDefaultCloseOperation(frame3.EXIT_ON_CLOSE);
        // frame.setBounds(350, 200, 400, 300);
        // frame.setTitle("Icon Changing");
    }
}
