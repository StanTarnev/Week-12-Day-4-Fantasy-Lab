import Tools.AttackTool;
import Tools.DefenceTool;
import enemies.Orc;
import goodguys.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Orc orc;

    @Before
    public void before(){
        dwarf = new Dwarf(AttackTool.AXE, DefenceTool.BARBARIANARMOR, 100, 100);

        orc = new Orc(AttackTool.DUMMY, DefenceTool.DUMMY, 150, 100);
    }

    @Test
    public void canAttack(){
        dwarf.attack(orc);
        assertEquals(43, orc.getHealth());
    }

}
