package machine_coding.tic_tac_toe.tic_tac_toe_V1;

import machine_coding.tic_tac_toe.tic_tac_toe_V1.Strategies.RowWinningStrategy;
import machine_coding.tic_tac_toe.tic_tac_toe_V1.controllers.GameController;
import machine_coding.tic_tac_toe.tic_tac_toe_V1.models.*;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer(1L, "Rahesh", new Symbol('O')));
        players.add(new BotPlayer(2L, "Bot 1", new Symbol('X'), BotDifficultyLevel.EASY));

        Game game = gameController.startGame(3, players, List.of(new RowWinningStrategy()));

        gameController.displayBoard(game);
        while (gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
            gameController.displayBoard(game);
            gameController.makeMove(game);
        }
        if (gameController.checkState(game).equals(GameState.SUCCESS)) {
            System.out.println(gameController.getWinner(game).getName()+" you win");
        }
        else if(gameController.checkState(game).equals(GameState.DRAW)){
            System.out.println("nobody wins");
        }

    }
}

// create packages
// convert class diagram into models, every entity as classes.

// shortcuts
// alt + insert = to insert classes and enums, select package.
// alt + enter = to import classes , put cursor on it.
// ctrl + click = move to class from instance var

// always provide constructor for each class, else null pointer exception.