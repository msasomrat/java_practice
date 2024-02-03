package java_gui;
import javax.swing.*;

public class frame2 extends JFrame {

        frame2(){
            
            setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
            setBounds(300, 300, 400, 300);
            setTitle("This is second GUI");
        }
       public static void main(String[] args) {
        frame2 frame = new frame2();
        frame.setVisible(true);
        
       }
}
