import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class gameFrame extends JFrame {
    gamePanel panel;

    gameFrame() {
        panel = new gamePanel();
        this.add(panel);
        this.setTitle("Ping Pong");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
