package goodguys;

import Tools.AttackTool;
import Tools.DefenceTool;

public class Knight extends Character {

    public Knight(AttackTool attackingTool, DefenceTool defensiveTool, int health, int strength) {
        super(attackingTool, defensiveTool, health, strength);
    }
}
