import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class MancalaGUI extends Application
{
    private Mancala game;
    private ArrayList<SimpleIntegerProperty> seeds;

    public MancalaGUI()
    {
        this.game = new Mancala(14, 4);

        this.seeds = new ArrayList<>();
        for(int seeds : game.getBoard())
            this.seeds.add(new SimpleIntegerProperty(seeds));
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Mancala");

        BorderPane borderPane = new BorderPane();

        int[] board = game.getBoard();

        borderPane.setLeft(new MancalaButton(0, 80, 160));

        GridPane gridPane = new GridPane();

        int r = 0;
        int c = 0;

        for(int i = board.length - 1; i > board.length / 2; i--)
        {
            gridPane.add(new MancalaButton(i), c, r);
            c++;
        }

        r = 1;
        c = 0;

        for(int i = 1; i < board.length / 2; i++)
        {
            gridPane.add(new MancalaButton(i), c, r);
            c++;
        }

        borderPane.setCenter(gridPane);

        borderPane.setRight(new MancalaButton(board.length / 2, 80, 160));

        primaryStage.setScene(new Scene(borderPane));
        primaryStage.show();
    }

    public class MancalaButton extends Button
    {
        private int id;

        public MancalaButton(int id)
        {
            this(id, 80, 80);
        }

        public MancalaButton(int id, int width, int height)
        {
            this.id = id;
            setPrefWidth(width);
            setPrefHeight(height);

            setOnMouseClicked(e -> onClick());
            textProperty().bind(seeds.get(id).asString());
        }

        private void onClick()
        {
            if(id != 0 && id != game.getBoard().length / 2)
            {
                game.move(id);
                updateSeeds();
            }
        }
    }

    private void updateSeeds()
    {
        int[] board = game.getBoard();
        for (int i = 0; i < board.length; i++)
            seeds.get(i).setValue(board[i]);
    }

    public static void main(String[] args)
    {
        new MancalaGUI();
        Application.launch(args);
    }
}