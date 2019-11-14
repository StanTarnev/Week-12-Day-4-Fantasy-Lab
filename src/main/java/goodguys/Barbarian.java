package goodguys;

import Tools.AttackTool;
import Tools.DefenceTool;

public class Barbarian extends Character {

    public Barbarian(AttackTool attackingTool, DefenceTool defensiveTool, int health, int strength) {
        super(attackingTool, defensiveTool, health, strength);
    }
}
