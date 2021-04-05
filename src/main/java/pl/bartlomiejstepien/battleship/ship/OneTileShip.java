package pl.bartlomiejstepien.battleship.ship;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import pl.bartlomiejstepien.battleship.board.Tile;

import java.util.List;

public class OneTileShip implements Ship
{
    private final Rectangle rectangle;
    private final List<Tile> tiles;

    OneTileShip(List<Tile> tiles)
    {
        this.tiles = tiles;
        this.rectangle = new Rectangle(this.tiles.stream()
                .mapToDouble(Tile::getWidth)
                .sum(),
                this.tiles.stream()
                .mapToDouble(Tile::getHeight)
                .sum(),
                Color.BLACK);
    }

    @Override
    public List<Tile> getTiles()
    {
        return this.tiles;
    }

    public Rectangle getRectangle()
    {
        return rectangle;
    }
}
