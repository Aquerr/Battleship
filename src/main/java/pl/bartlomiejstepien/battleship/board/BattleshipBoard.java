package pl.bartlomiejstepien.battleship.board;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.effect.Glow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.*;
import java.util.stream.Collectors;

public class BattleshipBoard extends TilePane
{
    private static final int MAX_ROW_COUNT = 11;
    private static final int MAX_COLUMN_COUNT = 11;

    private final Tile[][] boardTiles = new Tile[MAX_ROW_COUNT][MAX_COLUMN_COUNT];

    private final double oneCellWidth;

    public BattleshipBoard(int x, int y, double width)
    {
        this.oneCellWidth = width / MAX_ROW_COUNT;

        setLayoutX(x);
        setLayoutY(y);
        setWidth(width);
        setHeight(width);

        setPrefTileHeight(this.oneCellWidth);
        setPrefTileWidth(this.oneCellWidth);
        setPrefRows(MAX_ROW_COUNT);
        setPrefColumns(MAX_COLUMN_COUNT);

        prepareBattleshipBoard();
    }

    public Tile getTileAt(final int row, final int column)
    {
        if (row > MAX_ROW_COUNT - 1 || row < 1 || column > MAX_COLUMN_COUNT - 1 || column < 1)
            return null;
        return this.boardTiles[row][column];
    }

    public Tile[][] getTiles()
    {
        return this.boardTiles;
    }

    public List<Tile> getTilesAsList()
    {
        final List<Tile> tiles = new LinkedList<>();
        for (final Tile[] row : this.boardTiles)
        {
            tiles.addAll(Arrays.asList(row));
        }
        return tiles;
    }

    private void prepareBattleshipBoard()
    {
        final Tile[][] tiles = getTiles();
        final String[] numbers = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        final String[] letters = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (int row = 0; row < tiles.length; row++)
        {
            for (int column = 0; column < tiles[row].length; column++)
            {
                // Draw empty square
                if (row == 0 && column == 0)
                {
                    Tile tile = new Tile("", row, column, new Text(""));
                    tile.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderStroke.DEFAULT_WIDTHS)));
                    tiles[row][column] = tile;
                }
                else if (row == 0) // Draw numbers
                {
                    Text text = new Text(numbers[column - 1]);
                    Tile tile = new Tile(text.getText(), row, column, text);
                    tile.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderStroke.DEFAULT_WIDTHS)));
                    tiles[row][column] = tile;
                }
                else if (column == 0)
                {
                    Text text = new Text(letters[row - 1]); // Draw letters
                    Tile tile = new Tile(text.getText(), row, column, text);
                    tile.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderStroke.DEFAULT_WIDTHS)));
                    tiles[row][column] = tile;
                }
                else
                {
                    Tile tile = new Tile(letters[row - 1] + numbers[column - 1], row, column, null);
                    tile.setBackground(new Background(new BackgroundFill(Color.NAVAJOWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
                    tile.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderStroke.DEFAULT_WIDTHS)));
                    tiles[row][column] = tile;
                    tile.setPickOnBounds(true);
                    tile.setOnMouseClicked(this::tileClickEventHandler);
                    tile.setOnMouseEntered(this::tileEnterEventHandler);
                    tile.setOnMouseExited(this::tileExitEventHandler);
                }
            }
        }

        getChildren().addAll(getTilesAsList().stream().filter(Objects::nonNull).collect(Collectors.toList()));
    }

    private void tileClickEventHandler(MouseEvent mouseEvent)
    {
        Tile tile = (Tile) mouseEvent.getTarget();
        System.out.println("Clicked tile " + tile.getName());
        mouseEvent.consume();
    }

    private void tileExitEventHandler(MouseEvent mouseEvent)
    {
        ((Node)mouseEvent.getTarget()).setEffect(null);
        mouseEvent.consume();
    }

    private void tileEnterEventHandler(MouseEvent mouseEvent)
    {
        System.out.println(mouseEvent.getTarget());
        ((Node)mouseEvent.getTarget()).setEffect(new Glow(2));
        mouseEvent.consume();
    }
}
