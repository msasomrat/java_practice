import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui9 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create the main frame
            JFrame frame = new JFrame("Menu Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Create a text area to display the menu item clicked
            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);

            // Create a MenuBar
            JMenuBar menuBar = new JMenuBar();

            // Create Menus
            JMenu fileMenu = new JMenu("Indian States");
            JMenu editMenu = new JMenu("Indian Cities");

            // Create MenuItems
            JMenuItem openItem = new JMenuItem("Himachai Pradesh");
            JMenuItem saveItem = new JMenuItem("Rajasthan");
            JMenuItem cutItem = new JMenuItem("West Bengal");
            JMenuItem copyItem = new JMenuItem("Andra Pradesh");
            JMenuItem pasteItem = new JMenuItem("Tamilnadu");
            JMenuItem pasteItem2 = new JMenuItem("Karnataka");

            // Add ActionListeners to the MenuItems
            openItem.addActionListener(new MenuItemListener(textArea, "Himachai Pradesh"));
            saveItem.addActionListener(new MenuItemListener(textArea, "Rajasthan"));
            cutItem.addActionListener(new MenuItemListener(textArea, "West Bengal"));
            copyItem.addActionListener(new MenuItemListener(textArea, "Andra Pradesh"));
            pasteItem.addActionListener(new MenuItemListener(textArea, "Tamilnadu"));
            pasteItem2.addActionListener(new MenuItemListener(textArea, "Karnataka"));

            // Add MenuItems to the Menus
            fileMenu.add(openItem);
            fileMenu.add(saveItem);
            editMenu.add(cutItem);
            editMenu.add(copyItem);
            editMenu.add(pasteItem);
            editMenu.add(pasteItem2);

            // Add Menus to the MenuBar
            menuBar.add(fileMenu);
            menuBar.add(editMenu);

            // Set the MenuBar for the frame
            frame.setJMenuBar(menuBar);

            // Create a JScrollPane for the text area
            JScrollPane scrollPane = new JScrollPane(textArea);

            // Add the scroll pane to the frame
            frame.add(scrollPane);

            frame.setVisible(true);
        });
    }
}

class MenuItemListener implements ActionListener {
    private JTextArea textArea;
    private String menuItemText;

    public MenuItemListener(JTextArea textArea, String menuItemText) {
        this.textArea = textArea;
        this.menuItemText = menuItemText;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Display the clicked MenuItem's label in the text area
        textArea.append(menuItemText);
    }
}
