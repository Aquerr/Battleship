package pl.bartlomiejstepien.battleship.board;

import javafx.scene.shape.Rectangle;

public class Tile
{
    private Rectangle rectangle;
    private int row;
    private int column;

    public Tile(int row, int column, Rectangle rectangle)
    {
        this.row = row;
        this.column = column;
        this.rectangle = rectangle;
    }

    public int getRow()
    {
        return row;
    }

    public int getColumn()
    {
        return column;
    }

    public Rectangle getRectangle()
    {
        return rectangle;
    }
}
