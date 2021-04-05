package pl.bartlomiejstepien.battleship.board;

import javafx.scene.Node;
import javafx.scene.effect.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class Tile extends StackPane
{
    private final Node rectangle;
    private final String name;
    private final int row;
    private final int column;

    public Tile(String name, int row, int column, Node rectangle)
    {
        super();
        this.name = name;
        this.row = row;
        this.column = column;
        this.rectangle = rectangle;

        if (rectangle != null)
            getChildren().add(this.rectangle);
    }

    public int getRow()
    {
        return row;
    }

    public int getColumn()
    {
        return column;
    }

    public Node getRectangle()
    {
        return rectangle;
    }

    public String getName()
    {
        return name;
    }
}
