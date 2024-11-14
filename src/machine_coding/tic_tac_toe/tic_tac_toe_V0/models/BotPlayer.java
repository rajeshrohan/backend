package machine_coding.tic_tac_toe.tic_tac_toe_V0.models;

public class BotPlayer extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public BotPlayer(Long id, String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.setPlayerType(PlayerType.BOT);
    }

    public BotDifficultyLevel getBot() {
        return botDifficultyLevel;
    }

    public void setBot(BotDifficultyLevel bot) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
