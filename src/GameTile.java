import java.awt.*;

public class GameTile {
    public static final int TILE_SIDE_SIZE = 50;


    private Color color;
    private int col;
    private int row;

    public GameTile(int row, int col, Color color){
        this.row = row;
        this.col = col;
        this.color = color;
    }



    public void render(Graphics g) {
        int positionByX = this.col * TILE_SIDE_SIZE;
        int positionByY = this.row * TILE_SIDE_SIZE;

        g.setColor(this.color);
        g.fillRect(positionByX, positionByY , TILE_SIDE_SIZE, TILE_SIDE_SIZE);

        g.setColor(Color.black);
        g.drawRect(positionByX, positionByY , TILE_SIDE_SIZE, TILE_SIDE_SIZE);
        }
    }
