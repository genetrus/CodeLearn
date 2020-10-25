package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class twodigitNumbersTest {

    @Test
    public void print() {
        assertArrayEquals(new int[] {99}, twodigitNumbers.printFrom(99));
        assertArrayEquals(new int[] {98, 99}, twodigitNumbers.printFrom(98));
        assertArrayEquals(new int[] {95, 96, 97, 98, 99}, twodigitNumbers.printFrom(95));
    }
}