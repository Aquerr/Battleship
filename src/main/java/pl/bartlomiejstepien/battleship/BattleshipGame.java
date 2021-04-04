package pl.bartlomiejstepien.battleship;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class BattleshipGame extends Application
{

    public static void main(String[] args)
    {
        BattleshipGame.launch();
    }

    public void start(Stage primaryStage) throws Exception
    {
        // TODO: Tutaj napisz kod aplikacji!


    }

    private void drawBoard()
    {

    }

    private void exit()
    {
        Platform.exit();
        System.exit(0);
    }
}
