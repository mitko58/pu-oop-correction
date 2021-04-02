import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    public Board() {


        this.setSize(600, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 12; col++) {
                renderGameTile(row, col, g);

            }
        }
    }

    private void renderGameTile(int row, int col, Graphics g) {
        GameTile gameTile = new GameTile(row, col, Color.RED);
        gameTile.render(g);
    }
}