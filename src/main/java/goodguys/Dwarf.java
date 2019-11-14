package goodguys;

import Tools.AttackTool;
import Tools.DefenceTool;

public class Dwarf extends Character {

    public Dwarf(AttackTool attackingTool, DefenceTool defensiveTool, int health, int strength) {
        super(attackingTool, defensiveTool, health, strength);
    }
}