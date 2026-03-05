package _02_Woche._09_tag_JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TaschenrechnerTest {

    Taschenrechner taschenrechner = new Taschenrechner();

    @Test
    void testAddition() {
        assertEquals(5, taschenrechner.addition(2, 3));
    }

    @Test
    void testTeilen() {
        assertEquals(2, taschenrechner.teilen(10, 5));
    }

    @Test
    void testTeilenDurchNull() {
        assertThrows(IllegalArgumentException.class, () -> taschenrechner.teilen(3, 0));
        // OHNE Lambda: Code wird sofort ausgeführt (Test stürzt ab)
        // MIT Lambda: () -> , Code wird quasi als "Rezept" übergeben
        // -> es wird mit der Ausführung gewartet, bis der Test bereit ist
    }

}
