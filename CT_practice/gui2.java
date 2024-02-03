import javax.swing.*;

class MasterFrame extends JFrame {
    public MasterFrame() {
        setTitle("Master Frame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class TemporaryFrame extends JFrame {
    public TemporaryFrame() {
        setTitle("Temporary Frame");
        setSize(200, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

public class gui2 extends JFrame {
    public gui2() {
        setTitle("Main Class Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MasterFrame masterFrame = new MasterFrame();
        masterFrame.setVisible(true);

        TemporaryFrame tempFrame = new TemporaryFrame();
        tempFrame.setVisible(true);
    }
}
