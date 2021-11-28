package clean.code.design_patterns.requirements;



public class GameScore {
    private int score = 0;
    private static final GameScore instance = new GameScore();

    private GameScore() {
        this.score = 0;
    }

    public static GameScore getInstance() {
        return instance;
    }

    public int getScore() {
        return score;
    }

    public void AddScore(int valueToAdd) {
        this.score += valueToAdd;
    }

}
