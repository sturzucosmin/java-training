package clean.code.design_patterns.requirements;

public class Bow implements Weapon {
    @Override
    public void shoot() {
        GameScore gameScore = GameScore.getInstance();
        gameScore.AddScore(5);
    }
}

