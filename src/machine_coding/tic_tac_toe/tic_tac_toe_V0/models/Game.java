package machine_coding.tic_tac_toe.tic_tac_toe_V0.models;

import machine_coding.tic_tac_toe.tic_tac_toe_V0.Strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    // private Long id; created by database , we will not use here
    private Board board;
    private List<Player> players;
    private Player winner;
    private int nextPlayerIndex;
    private List<Move> moves;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;

    private Game(Builder builder){
        board = new Board(builder.dimension);
        this.players = builder.players;
        this.winner = null;
        this.nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.winningStrategies = builder.winningStrategies;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    // static inner class
    // take those attributes which are req by client

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        public void validate(){
            // 1. count of players = dimension -1;
            if(players.size() != dimension-1)
                throw new RuntimeException("Incorrect no of players");

            // 2. bot count <= 1
            int botCount = 0;
            for(Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT))
                    botCount++;
            }
            if(botCount > 1)
                throw new RuntimeException("Too many bot players");

            // 3. every player has different symbol
            // clean the validation code in multiple validate functions.
        }

        public Game build(){
            validate();
            return new Game(this);
        }
    }
}




