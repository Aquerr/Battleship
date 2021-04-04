package pl.bartlomiejstepien.battleship;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class BattleshipGame extends Application
{
    private Stage stage;
    private Scene scene;
    private Group group;
    private Group chessBoardGroup;

    public static void main(String[] args)
    {
        BattleshipGame.launch();
    }

    public void start(Stage primaryStage) throws Exception
    {
        // TODO: Tutaj napisz kod aplikacji!


        this.stage = primaryStage;
        this.stage.setHeight(600);
        this.stage.setWidth(1000);

        this.group = new Group();
        this.chessBoardGroup = new Group();
        this.scene = new Scene(this.group, this.stage.getWidth(), this.stage.getHeight(), Color.WHITESMOKE);

        this.stage.setScene(this.scene);
        this.stage.setOnCloseRequest(this::exit);
        this.stage.show();
    }

    private void drawBoard()
    {

    }

    private void exit(WindowEvent windowEvent)
    {
        Platform.exit();
        System.exit(0);
    }
}
