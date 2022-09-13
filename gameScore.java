import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class gameScore extends Rectangle {
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    gameScore(int GAME_WIDTH, int GAME_HEIGHT) {
        gameScore.GAME_WIDTH = GAME_WIDTH;
        gameScore.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN,60));

        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
    }
}
