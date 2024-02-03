import javax.swing.*;

public class gui4 extends JFrame {
    public gui4() {
        // Create MenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create File Menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem saveAsMenuItem = new JMenuItem("Save As");

        // Create Help Menu
        JMenu helpMenu = new JMenu("Help");
        JMenuItem helpMenuItem = new JMenuItem("Help");

        // Add MenuItems to Menus
        fileMenu.add(saveMenuItem);
        fileMenu.add(saveAsMenuItem);
        helpMenu.add(helpMenuItem);

        // Add Menus to MenuBar
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        // Set MenuBar for the frame
        setJMenuBar(menuBar);

        setTitle("Menu Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    public static void main(String[] args) {
        gui4 frame = new gui4();
        frame.setVisible(true);
    }
}
