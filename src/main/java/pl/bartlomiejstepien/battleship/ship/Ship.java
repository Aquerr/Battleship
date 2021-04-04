package pl.bartlomiejstepien.battleship.ship;

import pl.bartlomiejstepien.battleship.board.Tile;

import java.util.List;

public interface Ship
{
    List<Tile> getTiles();

    enum ShipType
    {
        ONE_TILE,
        TWO_TILE,
        THREE_TILE,
        FOUR_TILE
    }
}
