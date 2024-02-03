import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class menu_bar extends JFrame {

    private Container c;
    private JPanel panel1, panel2;
    private JButton button1, button2, button3, button4, button5;
    private BorderLayout b;
    private JMenuBar menubar;
    private JMenu file, edit, help;
    
    private JMenuItem newitem,open, save, cut, copy, paste, check;
    menu_bar()
    {
        c=this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 400, 500);
        setTitle("Menubar Layout");
        c.setLayout(null);

        menubar =  new JMenuBar();
        this.setJMenuBar(menubar);
        
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);

        newitem = new JMenuItem("Newkudfusd");
         open = new JMenuItem("open");
          save = new JMenuItem("save");
           cut = new JMenuItem("cut");
         copy = new JMenuItem("copy");
          paste = new JMenuItem("paste");
           check = new JMenuItem("check");
        
        file.add(newitem);
        file.add(open);
        file.add(save);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        help.add(check);
        listen_menu listen = new listen_menu();
        open.addActionListener(listen);

        
    }
    class listen_menu implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("open clicked");
        }
    }

    
    public static void main(String[] args) {
        menu_bar frame = new menu_bar();

        frame.setVisible(true);

    }
    
}

