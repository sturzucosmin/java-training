package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

public class Shooting implements Weapon {
    private List<Weapon> weapons = new ArrayList<Weapon>();

    public void add(Weapon w) {
        this.weapons.add(w);
    }

    @Override
    public void shoot() {
        for (Weapon wp : weapons) {
            wp.shoot();
        }
    }
}
