package Tools;

public enum AttackTool {
    SWORD(6),
    AXE(7),
    CLUB(5),
    FIREBALL(9),
    LIGHTNINGSTRIKE(10),
    DUMMY(0);


    private final int value;

    AttackTool(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
