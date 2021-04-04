package pl.bartlomiejstepien.battleship.board;

import pl.bartlomiejstepien.battleship.Tile;

public class BattleShipBoard
{
    private static final int ROW_COUNT = 10;
    private static final int COLUMN_COUNT = 10;

    private final Tile[][] boardTiles = new Tile[ROW_COUNT + 1][COLUMN_COUNT + 1];

    public Tile getTileAt(int row, int column)
    {
        if (row > ROW_COUNT || row < 1 || column > COLUMN_COUNT || column < 1)
            return null;

        return this.boardTiles[row][column];
    }
}
