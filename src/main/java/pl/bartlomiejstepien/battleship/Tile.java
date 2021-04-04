package pl.bartlomiejstepien.battleship;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Tile extends StackPane
{
    private final int column;
    private final int row;

    public Tile(int column, int row)
    {
        this.column = column;
        this.row = row;

        setWidth(50);
        setHeight(50);

        setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderStroke.THIN)));
    }

    public int getColumn()
    {
        return column;
    }

    public int getRow()
    {
        return row;
    }
}
