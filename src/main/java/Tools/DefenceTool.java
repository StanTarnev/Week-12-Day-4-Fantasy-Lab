package Tools;

public enum DefenceTool {

    KNIGHTARMOR(6),
    DWARFARMOR(7),
    BARBARIANARMOR(5),
    DEFENSIVESPELL(8),
    DUMMY(0);

    private final int value;

    DefenceTool(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
