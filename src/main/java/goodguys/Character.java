package goodguys;

import Tools.AttackTool;
import Tools.DefenceTool;

public abstract class Character {
    private AttackTool attackingTool;
    private DefenceTool defensiveTool;
    private int health;
    private int strength;

     public Character(AttackTool attackingTool, DefenceTool defensiveTool, int health, int strength) {
         this.attackingTool = attackingTool;
         this.defensiveTool = defensiveTool;
         this.health = health;
         this.strength = strength;
     }


     public void attack(Character character){
         character.takeDamage(this.strength += this.attackingTool.getValue());
     }

     public void takeDamage(int value){
         if(value > defensiveTool.getValue()){
             this.health -= (value - defensiveTool.getValue());
         }
     }
      public void changeAttackTool(AttackTool newTool){
         this.attackingTool = newTool;
      }

    public AttackTool getAttackingTool() {
        return attackingTool;
    }

    public void setAttackingTool(AttackTool attackingTool) {
        this.attackingTool = attackingTool;
    }

    public DefenceTool getDefensiveTool() {
        return defensiveTool;
    }

    public void setDefensiveTool(DefenceTool defensiveTool) {
        this.defensiveTool = defensiveTool;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
