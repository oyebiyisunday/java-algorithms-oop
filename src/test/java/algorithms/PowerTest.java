package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PowerTest {
    @Test
    void returnsOneWhenExponentIsZero() {
        assertEquals(1, Power.power(5, 0));
    }

    @Test
    void returnsBaseWhenExponentIsOne() {
        assertEquals(4, Power.power(4, 1));
    }

    @Test
    void calculatesPositiveExponents() {
        assertEquals(25, Power.power(5, 2));
        assertEquals(216, Power.power(6, 3));
    }

    @Test
    void rejectsNegativeExponent() {
        assertThrows(IllegalArgumentException.class, () -> Power.power(2, -1));
    }
}
