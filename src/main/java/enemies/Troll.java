package enemies;

import Tools.AttackTool;
import Tools.DefenceTool;
import goodguys.Barbarian;
import goodguys.Character;


public class Troll extends Character {

    public Troll(AttackTool attackingTool, DefenceTool defensiveTool, int health, int strength){
        super(attackingTool, defensiveTool, health, strength);

    }
}