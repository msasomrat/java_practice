import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui8 {

    public gui8() {
        // Create the frame
        JFrame frame = new JFrame("Indian Cities Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create MenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create Menus
        JMenu statesMenu = new JMenu("Indian States");

        // Add MenuItems for Indian states and their cities
        JMenuItem mumbaiItem = new JMenuItem("Mumbai");
        JMenuItem delhiItem = new JMenuItem("Delhi");
        JMenuItem chennaiItem = new JMenuItem("Chennai");

        // Add ActionListeners to MenuItems
        mumbaiItem.addActionListener(new CityMenuItemListener("Mumbai"));
        delhiItem.addActionListener(new CityMenuItemListener("Delhi"));
        chennaiItem.addActionListener(new CityMenuItemListener("Chennai"));

        // Add MenuItems to the 'Maharashtra' menu
        statesMenu.add(mumbaiItem);
        statesMenu.add(delhiItem);
        statesMenu.add(chennaiItem);

        // Add Menus to MenuBar
        menuBar.add(statesMenu);

        // Set MenuBar to the frame
        frame.setJMenuBar(menuBar);

        // Display the frame
        frame.setVisible(true);
    }

    // ActionListener for MenuItems
    class CityMenuItemListener implements ActionListener {
        private String city;

        public CityMenuItemListener(String city) {
            this.city = city;
        }

        public void actionPerformed(ActionEvent e) {
            // Display the selected city in a JOptionPane
            JOptionPane.showMessageDialog(null, "Selected City: " + city, "City Selection", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Run the GUI code on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new gui8();
            }
        });
    }
}
