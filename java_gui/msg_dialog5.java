package java_gui;

import javax.swing.JOptionPane;

public class msg_dialog5 {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to exit ", "Exit", JOptionPane.YES_NO_CANCEL_OPTION);
    
        if(choice == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        else if(choice == JOptionPane.NO_OPTION)
        {
            System.out.println("No Option Selected");
        }
        else if(choice == JOptionPane.CANCEL_OPTION)
        {
            System.out.println("Cancel Option Selected");
        }
        
    }
    
}
