import javax.swing.*;
import java.awt.*;

public class Launcher {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Game");
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null); // center on screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
