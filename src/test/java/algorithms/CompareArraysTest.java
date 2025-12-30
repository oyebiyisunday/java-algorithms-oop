package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CompareArraysTest {
    @Test
    void returnsTrueForEqualArrays() {
        int[] a = {2, 3, 4, 5};
        int[] b = {2, 3, 4, 5};
        assertTrue(CompareArrays.compare(a, b));
    }

    @Test
    void returnsFalseForDifferentLengths() {
        int[] a = {6, 3, 8};
        int[] b = {6, 3, 8, 4};
        assertFalse(CompareArrays.compare(a, b));
    }

    @Test
    void returnsTrueForEmptyArrays() {
        int[] a = {};
        int[] b = {};
        assertTrue(CompareArrays.compare(a, b));
    }

    @Test
    void returnsFalseForDifferentValues() {
        int[] a = {5678};
        int[] b = {5679};
        assertFalse(CompareArrays.compare(a, b));
    }

    @Test
    void rejectsNullArrays() {
        assertThrows(IllegalArgumentException.class, () -> CompareArrays.compare(null, new int[]{1}));
        assertThrows(IllegalArgumentException.class, () -> CompareArrays.compare(new int[]{1}, null));
    }
}
