package pl.bartlomiejstepien.battleship.ship;

import javafx.scene.shape.Rectangle;
import pl.bartlomiejstepien.battleship.board.Tile;

import java.util.List;

public class OneTileShip implements Ship
{
    private Rectangle rectangle;
    private List<Tile> tiles;

    OneTileShip(List<Tile> tiles)
    {
        this.tiles = tiles;
    }

    @Override
    public List<Tile> getTiles()
    {
        return this.tiles;
    }
}
