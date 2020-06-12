package Opdracht4;
import javax.swing.*;

public class mainWindow extends JFrame{
    public mainWindow() {
        setSize(235, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Personen overzicht");
        setContentPane(new mainPanel());
        setVisible(true);
    }
}