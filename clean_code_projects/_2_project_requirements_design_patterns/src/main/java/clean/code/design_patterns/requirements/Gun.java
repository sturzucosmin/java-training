package clean.code.design_patterns.requirements;

public class Gun implements Weapon {
    @Override
    public void shoot() {
        GameScore gameScore = GameScore.getInstance();
        gameScore.AddScore(15);
    }
}
