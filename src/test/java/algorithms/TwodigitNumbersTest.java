package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwodigitNumbersTest {

    @Test
    public void print() {
        assertArrayEquals(new int[] {99}, TwodigitNumbers.printFrom(99));
        assertArrayEquals(new int[] {98, 99}, TwodigitNumbers.printFrom(98));
        assertArrayEquals(new int[] {95, 96, 97, 98, 99}, TwodigitNumbers.printFrom(95));
    }
}