package pl.bartlomiejstepien.battleship.ship;

import pl.bartlomiejstepien.battleship.board.Tile;

import java.util.List;

public class ShipFactory
{
    public static Ship createShip(Ship.ShipType shipType, List<Tile> tiles)
    {
        switch (shipType)
        {
            case ONE_TILE:
                return new OneTileShip(tiles);
            default:
                throw new IllegalArgumentException("Tile not specified!");
        }
    }
}
