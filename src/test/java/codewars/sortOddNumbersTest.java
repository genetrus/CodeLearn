package codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class sortOddNumbersTest {

    @Test
    public void testSortArray1() {
        assertArrayEquals(new int[] {3, 5, 6, 2, 7}, SortOddNumbers.sortArray(new int[] {3, 7, 6, 2, 5}));
    }
    @Test
    public void testSortArray2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, SortOddNumbers.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }
    @Test
    public void testSortArray3() {
        assertArrayEquals(new int[]{}, SortOddNumbers.sortArray(new int[]{}));
    }
}