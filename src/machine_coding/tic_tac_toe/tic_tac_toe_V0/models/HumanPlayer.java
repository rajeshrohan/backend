package machine_coding.tic_tac_toe.tic_tac_toe_V0.models;

public class HumanPlayer extends Player{
    public HumanPlayer(Long id, String name, Symbol symbol) {
        super(id, name, symbol);
        this.setPlayerType(PlayerType.HUMAN);
    }
}
