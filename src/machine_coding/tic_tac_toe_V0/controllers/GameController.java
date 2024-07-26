package machine_coding.tic_tac_toe_V0.controllers;

import machine_coding.tic_tac_toe_V0.Strategies.WinningStrategy;
import machine_coding.tic_tac_toe_V0.models.Game;
import machine_coding.tic_tac_toe_V0.models.GameState;
import machine_coding.tic_tac_toe_V0.models.Player;

import java.util.List;

public class GameController {
    //    Game game;
    //    public GameController(){
    //        this.game = new Game();
    //    }
    // game controller should be single and games can be multiple

    public Game startGame(
        int dimension,
        List<Player> players,
        List<WinningStrategy> winningStrategies
        ){

        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }
    public GameState checkState( Game game){
        return game.getGameState();
    }
    public void displayBoard(Game game){

    }
    public void makeMove(Game game){

    }
    public Player getWinner(Game game){
        return game.getWinner();
    }
    public void undo(Game game){

    }
}
// 1. start the game: create object of game
// size of board, create board, get no of player, all input

// 2. display the board
// 3. make the move , check for winner
// continue step 2 and 3 , untill game is in progress

// 4. on basic of game state, show output
// success : get winner,  draw : print draw

// 5. get the winner on success.

// 6. undo functionality

// eventually client should not have access to game object directly,
// so, we should pass id.


