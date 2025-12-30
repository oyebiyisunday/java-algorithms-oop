package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BubbleSortTest {
    @Test
    void sortsArrayInAscendingOrder() {
        int[] data = {9, 1, 5, 3, 9, 2};
        BubbleSort.sort(data);
        assertArrayEquals(new int[]{1, 2, 3, 5, 9, 9}, data);
    }

    @Test
    void keepsAlreadySortedArray() {
        int[] data = {1, 2, 3, 4};
        BubbleSort.sort(data);
        assertArrayEquals(new int[]{1, 2, 3, 4}, data);
    }

    @Test
    void handlesEmptyArray() {
        int[] data = {};
        BubbleSort.sort(data);
        assertArrayEquals(new int[]{}, data);
    }

    @Test
    void rejectsNullArray() {
        assertThrows(IllegalArgumentException.class, () -> BubbleSort.sort(null));
    }
}
